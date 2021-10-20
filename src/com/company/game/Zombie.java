package com.company.game;

public class Zombie implements CreatureInterface {
    @Override
    public String getName() {
        return "Zombie";
    }

    @Override
    public double attack() {
        return 15.5;
    }

    @Override
    public double health() {
        return 20;
    }
}
