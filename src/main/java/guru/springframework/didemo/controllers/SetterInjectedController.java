package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import guru.springframework.didemo.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    // Interface üzerinden bağladığımız için hangi service i inject edeceğini spring bilemiyor.
    // dolayısıyla hangisini inject edecekse onun bean adını(lower ile başlar) veriyoruz.
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
