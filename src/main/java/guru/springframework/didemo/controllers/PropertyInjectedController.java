package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.interfaces.IGreetingService;

public class PropertyInjectedController {

    // I have property here to intialize it I need to access from this class. bad practice
    public IGreetingService greetingService;

    public String sayHello(){
       return getGreetingService().sayHello();
    }

    public IGreetingService getGreetingService(){
        return greetingService;
    }
}
