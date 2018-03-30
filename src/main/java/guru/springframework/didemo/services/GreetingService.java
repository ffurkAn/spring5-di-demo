package guru.springframework.didemo.services;

import guru.springframework.didemo.services.interfaces.IGreetingService;

public class GreetingService implements IGreetingService {

    public static final String HI_GUYS = "Hi Guys!!";

    @Override
    public String sayHello() {
        return HI_GUYS;
    }
}
