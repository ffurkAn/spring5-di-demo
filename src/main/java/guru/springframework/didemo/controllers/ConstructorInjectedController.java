package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import guru.springframework.didemo.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired
    private GreetingService greetingService;


    public ConstructorInjectedController(){

    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
