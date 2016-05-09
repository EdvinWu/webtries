package hello.services.impl;

import hello.entities.Login;
import hello.entities.Person;
import hello.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private HashServiceImpl hashServiceImpl;
    @Autowired
    private PersonServiceImpl personService;

    @Override
    public void hashPassword(Login login) {
        login.setPassword(hashServiceImpl.getHashPassword(login.getPassword()));
    }


    @Override
    public boolean validCredentials(Login login) {
        Person person;
        person = personService.getByEmail(login.getEmail());
        return hashServiceImpl.passwordMatch(login.getPassword(),person.getPassword());
    }
}
