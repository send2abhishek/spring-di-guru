package com.spirngframework.learn.springdependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
