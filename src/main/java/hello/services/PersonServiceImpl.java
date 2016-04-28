package hello.services;

import hello.dao.PersonRepository;
import hello.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        Person savedPerson = personRepository.saveAndFlush(person);
        return savedPerson;
    }

    @Override
    public void deletePerson(long id) {
        personRepository.delete(id);

    }

    @Override
    public Person getByEmail(String email) {
        return null;//personRepository.findByEmail(email);
    }

    @Override
    public Person editPerson(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
