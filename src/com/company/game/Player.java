package com.company.game;

public class Player implements CreatureInterface {
    @Override
    public String getName() {
        return "Player";
    }

    @Override
    public double attack() {
        return 20;
    }

    @Override
    public double health() {
        return 100;
    }
}
