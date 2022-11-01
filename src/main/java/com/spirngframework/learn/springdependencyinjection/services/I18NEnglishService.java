package com.spirngframework.learn.springdependencyinjection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18n")
public class I18NEnglishService implements GreetingService{
    @Override
    public String sayHello() {
        return "hello i18n-English";
    }
}
