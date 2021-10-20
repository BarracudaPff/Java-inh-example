package com.company.inh;

public class Dog extends Animal {
    public Dog(String name, int color) {
        super(name, color);
    }

    public void woof() {
        System.out.println(name + ": woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
