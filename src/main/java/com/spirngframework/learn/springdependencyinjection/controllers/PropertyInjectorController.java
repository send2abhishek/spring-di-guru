package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.GreetingService;


public class PropertyInjectorController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
