package com.example7;

import config.AppConfig7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig7.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.coding();
    }
}
