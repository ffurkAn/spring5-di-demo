package guru.services;

import guru.services.interfaces.GreetingService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from Constructor Service";
    }
}
