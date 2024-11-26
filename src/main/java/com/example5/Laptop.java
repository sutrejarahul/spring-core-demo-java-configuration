package com.example5;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop object created.");
    }

    @Override
    public void compile() {
        System.out.println("code compiling using laptop.");
    }
}
