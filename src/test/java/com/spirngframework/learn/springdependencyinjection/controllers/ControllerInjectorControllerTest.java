package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectorController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}