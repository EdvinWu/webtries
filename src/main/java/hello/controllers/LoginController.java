package hello.controllers;

import hello.entities.Login;
import hello.services.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl logInService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Login login) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(@Valid Login login) {
        return "login";
    }
}
