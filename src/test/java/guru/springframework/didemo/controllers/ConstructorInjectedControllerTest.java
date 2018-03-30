package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception {
        // there is no way we create class without injecting service. good practice and most preferred as well
        this.constructorInjectedController = new ConstructorInjectedController( new GreetingService());
    }

    @Test
    public void sayHello() {
    }
}