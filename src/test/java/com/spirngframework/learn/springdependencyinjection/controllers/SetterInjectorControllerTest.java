package com.spirngframework.learn.springdependencyinjection.controllers;

import com.spirngframework.learn.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectorControllerTest {

    SetterInjectorController controller;

    @BeforeEach
    void setUp() {

        controller=new SetterInjectorController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}