package com.company.inh;

public class Fox extends Dog {
    public Fox(String name, int color) {
        super(name, color);
    }

    @Override
    public void sleep() {
        System.out.println("Fox is sleeping...");
    }
}
