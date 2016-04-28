package hello.services;

import hello.entities.Person;

import java.util.List;

public interface PersonService {

    public Person addPerson(Person person);
    public void deletePerson(long id);
    public Person getByEmail(String email);
    public Person editPerson(Person person);
    List<Person> getAll();


}
