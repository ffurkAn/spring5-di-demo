package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private  SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingService());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingService.HI_GUYS, setterInjectedController.sayHello());
    }
}