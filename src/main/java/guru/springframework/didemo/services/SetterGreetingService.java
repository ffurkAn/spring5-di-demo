package guru.springframework.didemo.services;

import guru.springframework.didemo.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from Getter Service";
    }
}
