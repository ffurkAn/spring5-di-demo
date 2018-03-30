package guru.springframework.didemo.services;

import guru.springframework.didemo.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HI_GUYS = "Hi Guys!! -- ORIGINAL";

    @Override
    public String sayHello() {
        return HI_GUYS;
    }
}
