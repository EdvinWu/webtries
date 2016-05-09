package hello.services;

import hello.entities.Login;

public interface LoginService {
    public void hashPassword(Login login);

    public boolean validCredentials (Login login);
}
