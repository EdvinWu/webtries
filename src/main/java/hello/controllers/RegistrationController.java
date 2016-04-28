package hello.controllers;

import hello.entities.Person;
import hello.services.HashedPassword;
import hello.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
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
    public String greetingForm(Model model) {
        model.addAttribute("person", new Person());
        return "greeting";
    }



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Person person, Model model)   {
        model.addAttribute("reg", person);
        HashedPassword hashedPassword = new HashedPassword();
        person.setPassword(hashedPassword.getHashPassword(person.getPassword()));
        personService.addPerson(person);
        return "result";
    }


}