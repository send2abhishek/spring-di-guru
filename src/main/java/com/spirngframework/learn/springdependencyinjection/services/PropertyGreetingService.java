package com.spirngframework.learn.springdependencyinjection.services;

import org.springframework.stereotype.Service;


@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World- property";
    }
}
