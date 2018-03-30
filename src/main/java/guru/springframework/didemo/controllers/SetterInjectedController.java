package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.interfaces.IGreetingService;

public class SetterInjectedController {

    private IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
