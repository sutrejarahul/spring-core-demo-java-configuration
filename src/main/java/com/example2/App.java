package com.example2;

import config.AppConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);

//        Alien alien = applicationContext.getBean("alien", Alien.class);

//        Alien alien = applicationContext.getBean("alien1", Alien.class);

        Alien alien = applicationContext.getBean("unknown", Alien.class);
        alien.coding();
    }
}
