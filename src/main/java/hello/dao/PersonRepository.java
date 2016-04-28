package hello.dao;

import hello.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository  extends JpaRepository<Person,Long>{
    //@Query("SELECT p from person p where p.email = :email")
    //public Person findByEmail(@Param("email") String email);
}
