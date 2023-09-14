package de.stralsund.webtech.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController {
    @GetMapping(path = "/")
    public ModelAndView showHelloWorldControllerPage(){
        return new ModelAndView("helloworld");

    }
}
