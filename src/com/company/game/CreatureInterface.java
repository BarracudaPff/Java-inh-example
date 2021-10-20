package com.company.game;

public interface CreatureInterface {
    String getName();
    double attack();
    double health();

    default void move() {
        System.out.println("MOVING");
    }
}
