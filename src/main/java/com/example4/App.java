package com.example4;

import config.AppConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig4.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.coding();
    }
}
