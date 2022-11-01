package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectorController();
        controller.greetingService =new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}