package com.spirngframework.learn.springdependencyinjection;

import com.spirngframework.learn.springdependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        // run method returns the application context
        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        // by default get bean method returns the bean with claas name starting with lower case
        // inside the spring context its bean is created
        I18nController i18nController=(I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController controller=(MyController) context.getBean("myController");

        System.out.println("---primary based controller ...");
        System.out.println(controller.sayHello());

        System.out.println("---property based controller ...");
        PropertyInjectorController propertyInjectorController=(PropertyInjectorController) context.getBean("propertyInjectorController");
        System.out.println(propertyInjectorController.getGreeting());


        System.out.println("---setter based controller ...");
        SetterInjectorController setterInjectorController=(SetterInjectorController) context.getBean("setterInjectorController");
        System.out.println(setterInjectorController.getGreeting());

        System.out.println("---constructor based controller ...");
         ConstructorInjectorController constructorInjectorController =(ConstructorInjectorController) context.getBean("constructorInjectorController");
        System.out.println(constructorInjectorController.getGreeting());

    }

}
