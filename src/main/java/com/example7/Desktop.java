package com.example7;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements  Computer {

    public Desktop() {
        System.out.println("Desktop object created.");
    }

    @Override
    public void compile() {
        System.out.println("code compiling using desktop.");
    }
}
