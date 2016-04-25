package hello.controllers;

import hello.entities.Person;
import hello.services.HashedPassword;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class RegistrationController {

    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("person", new Person());
        return "greeting";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Person person, Model model ) {
        model.addAttribute("reg", person);
        return "result";
    }



}