package hello.entities;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Person {


    private String name;
    private String surname;
    private String password;
    private String email;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name: " + name + " surname: " + surname + "email: " + email + " password: " + password + " age: " + age;
    }
}
