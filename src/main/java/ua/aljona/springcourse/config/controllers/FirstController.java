package ua.aljona.springcourse.config.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello";

    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             @RequestParam(value = "action", required = false) String action, Model model) {
        double result = 0;
        switch (action) {
            case "multiply": result = a * b;
            break;
            case "divide": result = (double) a/b;
            break;
            case "add": result = a + b;
            break;
            case "subtract": result = a - b;
            break;
            default: result = 0.0;
            break;
        }
        model.addAttribute("result", result);

        return "first/calculator";
    }




    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
