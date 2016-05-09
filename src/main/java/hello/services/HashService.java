package hello.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface HashService {
    public String getHashPassword(String password);

    public boolean passwordMatch(String rawPassword, String encodedPassword);

}
