package com.company.inh;

public class Cat extends Animal {
    public Cat(String name, int color) {
        super(name, color);
    }

    public void meow() {
        System.out.println(name + ": meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
