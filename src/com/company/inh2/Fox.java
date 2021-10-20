package com.company.inh2;

public class Fox extends Animal implements DogInterface, CatInterface {
    public Fox(String name, int color) {
        super(name, color);
    }

    @Override
    public void sleep() {
        System.out.println("Fox is sleeping...");
    }

    @Override
    public void meow() {
        System.out.println("Fox meow!");
    }

    @Override
    public void woof() {
        System.out.println("Fox woof!");
    }
}
