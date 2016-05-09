package hello.services.impl;

import hello.repository.PersonRepository;
import hello.entities.Person;
import hello.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private HashServiceImpl hashServiceImpl;

    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(long id) {
        personRepository.delete(id);

    }

    @Override
    public Person getByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    @Override
    public Person editPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public void hashPassword(Person person){
        person.setPassword(hashServiceImpl.getHashPassword(person.getPassword()));

    }
}
