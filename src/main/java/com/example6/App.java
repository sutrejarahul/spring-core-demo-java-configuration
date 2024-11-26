package com.example6;

import config.AppConfig6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig6.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.codding();
    }
}
