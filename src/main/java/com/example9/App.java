package com.example9;

import config.AppConfig9;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig9.class);

        Alien alien = applicationContext.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.coding();
    }
}
