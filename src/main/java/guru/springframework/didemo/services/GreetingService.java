package guru.springframework.didemo.services;

import guru.springframework.didemo.services.interfaces.IGreetingService;

public class GreetingService implements IGreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hi Guys!!");
    }
}
