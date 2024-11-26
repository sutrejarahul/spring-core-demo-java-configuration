package com.example8;

import config.AppConfig8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig8.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.coding();
    }
}
