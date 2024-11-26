package com.example7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    @Autowired
    @Qualifier("laptop")
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

    public void coding(){
        System.out.println("coding..");
        computer.compile();
    }
}
