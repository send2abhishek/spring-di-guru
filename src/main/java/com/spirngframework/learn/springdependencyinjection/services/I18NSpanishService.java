package com.spirngframework.learn.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18n")
public class I18NSpanishService implements GreetingService{

    @Override
    public String sayHello() {
        return "hello i18n-Spanish";
    }
}
