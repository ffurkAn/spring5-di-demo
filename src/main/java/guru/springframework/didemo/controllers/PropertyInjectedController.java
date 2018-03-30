package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class PropertyInjectedController {

    // I have property here
    // its public - WRONG
    // its the concrete class - WRONG
    public GreetingService greetingService;

    public void sayHello(){
       getGreetingService().sayHello();
    }

    public GreetingService getGreetingService(){
        return greetingService;
    }
}
