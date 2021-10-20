package com.company.inh;

public abstract class Animal {
    public String name;
    public int color;

    public Animal(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public boolean isAlive() {
        return true;
    }

    public abstract void sleep();
}
