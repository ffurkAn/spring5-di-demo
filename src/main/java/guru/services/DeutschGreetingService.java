package guru.services;

import guru.services.interfaces.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class DeutschGreetingService implements GreetingService {


    @Override
    public String sayHello() {
        return "Hallo, Wie geths Du?";
    }
}
