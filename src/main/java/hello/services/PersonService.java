package hello.services;

import hello.entities.Person;

import java.util.List;

public interface PersonService {

    Person addPerson(Person person);

    void deletePerson(long id);

    Person getByEmail(String email);

    Person editPerson(Person person);

    List<Person> getAll();

    void hashPassword(Person person);

}
