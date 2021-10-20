package com.company.inh2;

public abstract class Animal implements AnimalInterface {
    public String name;
    public int color;

    public Animal(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public boolean isAlive() {
        return true;
    }
}
