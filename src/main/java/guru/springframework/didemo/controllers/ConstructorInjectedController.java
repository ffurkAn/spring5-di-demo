package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.interfaces.IGreetingService;

public class ConstructorInjectedController {

    private IGreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayHello();
    }
}
