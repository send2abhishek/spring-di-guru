package com.spirngframework.learn.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World- setter";
    }
}
