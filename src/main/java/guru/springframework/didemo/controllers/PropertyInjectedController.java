package guru.springframework.didemo.controllers;

import guru.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    // I have property here to intialize it I need to access from this class. bad practice
    @Autowired
    public GreetingServiceImpl greetingService; // we add @service annotation to GreetingService and we managed to autowire

    public String sayHello(){
        return greetingService.sayHello();
    }

    /*
     we used interface but named it to match with the class name. Spring uses its reflection and finds the correct service 
     public GreetingService greetingServiceImpl; // we add @service annotation to GreetingService and we managed to autowire

    public String sayHello(){
        return greetingServiceImpl.sayHello();
    }

     */

}
