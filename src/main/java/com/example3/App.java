package com.example3;

import config.AppConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig3.class);

        Alien alien1 = applicationContext.getBean(Alien.class);
        alien1.coding();
        Alien alien2 = applicationContext.getBean(Alien.class);
        alien2.coding();
    }
}
