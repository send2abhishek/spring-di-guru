package com.spirngframework.learn.springdependencyinjection;

import com.spirngframework.learn.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        // run method returns the application context
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        // by default get bean method returns the bean with claas name starting with lower case
        MyController controller=(MyController) context.getBean("myController");

        System.out.println(controller.sayHello());

    }

}
