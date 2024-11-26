package com.example1;

import config.AppConfig1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class);

        Alien alien = applicationContext.getBean(Alien.class);
        alien.coding();
    }
}
