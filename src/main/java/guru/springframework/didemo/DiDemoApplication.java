package guru.springframework.didemo;

import guru.examplebeans.FakeDataSource;
import guru.examplebeans.FakeJms;
import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.services","guru.springframework.didemo.controllers","guru.examplebeans","guru.config"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) context.getBean("myController"); // lowercase

        controller.sayHello();

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJms fakeJms = context.getBean(FakeJms.class);
        System.out.println(fakeJms.getNickname());

    }
}
