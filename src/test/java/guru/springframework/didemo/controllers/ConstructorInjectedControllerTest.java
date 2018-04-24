package guru.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception {
        // there is no way we create class without injecting service. good practice and most preferred as well
        // this.constructorInjectedController = new ConstructorInjectedController( new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
    }
}