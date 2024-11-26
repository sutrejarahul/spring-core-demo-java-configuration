package com.example6;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    private Computer computer;

    public Alien() {
        System.out.println("Alien object created.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void codding(){
        System.out.println("codding..");
        computer.compile();
    }
}
