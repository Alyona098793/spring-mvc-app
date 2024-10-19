package ua.aljona.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        System.out.println("s");
        return "first/hello";

    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
