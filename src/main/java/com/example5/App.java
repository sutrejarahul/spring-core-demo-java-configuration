package com.example5;


import config.AppConfig5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig5.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.coding();
    }
}
