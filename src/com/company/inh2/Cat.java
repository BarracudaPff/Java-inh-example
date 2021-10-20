package com.company.inh2;

public class Cat extends Animal implements CatInterface {
    public Cat(String name, int color) {
        super(name, color);
    }

    @Override
    public void meow() {
        System.out.println(name + ": meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
