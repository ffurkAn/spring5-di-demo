package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class SetterInjectedController {

    // its the concrete class - WRONG
    private GreetingService greetingService;

    public void sayHello(){
        greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
