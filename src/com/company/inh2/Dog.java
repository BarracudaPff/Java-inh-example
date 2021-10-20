package com.company.inh2;

public class Dog extends Animal implements DogInterface {
    public Dog(String name, int color) {
        super(name, color);
    }

    @Override
    public void woof() {
        System.out.println(name + ": woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
