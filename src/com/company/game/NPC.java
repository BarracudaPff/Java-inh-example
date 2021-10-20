package com.company.game;

public class NPC implements CreatureInterface  {
    @Override
    public String getName() {
        return "NPC";
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double health() {
        return 80;
    }
}
