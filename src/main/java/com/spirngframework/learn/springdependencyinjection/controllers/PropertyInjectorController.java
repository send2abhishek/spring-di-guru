package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// property based di
@Controller
public class PropertyInjectorController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
