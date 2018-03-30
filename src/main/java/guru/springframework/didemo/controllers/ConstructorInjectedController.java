package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {

    //its the concrete class - WRONG
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    void sayHello(){
        greetingService.sayHello();
    }
}
