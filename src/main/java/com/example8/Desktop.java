package com.example8;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created.");
    }

    @Override
    public void compile() {
        System.out.println("code compiling using desktop.");
    }
}
