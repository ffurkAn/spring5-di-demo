package guru.springframework.didemo.controllers;

import guru.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Interface üzerinden bağladığımız için hangi service i inject edeceğini spring bilemiyor.
    // dolayısıyla hangisini inject edecekse onun bean adını(lower ile başlar) veriyoruz.
    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
