package hello.controllers;

import hello.entities.Person;
import hello.services.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signUp(Model model) {
        model.addAttribute("person", new Person());
        return "signUp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String signSubmit(@ModelAttribute Person person, Model model)   {
        model.addAttribute("reg", person);
        personService.hashPassword(person);
        personService.addPerson(person);
        return "signUpResult";
    }
}