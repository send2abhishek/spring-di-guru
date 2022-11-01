package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.GreetingService;

// property based di
public class PropertyInjectorController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
