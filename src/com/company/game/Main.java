package com.company.game;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        Zombie zombie1 = new Zombie();
//        Zombie zombie2 = new Zombie();
//        Zombie zombie3 = new Zombie();
//        NPC npc = new NPC();

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        float[] floats = new float[]{1, 2, 3, 4, 5};

        CreatureInterface[] creatures = new CreatureInterface[]{
                new NPC(), new Player(), new Zombie(), new Zombie(),
                new Zombie(), new Zombie(), new NPC(), new Zombie()
        };

        for (CreatureInterface creature : creatures) {
            System.out.println(creature.getName() + ": " + creature.attack() + ", " + creature.health());
        }

        System.out.println("=".repeat(100));

        for (CreatureInterface creature : creatures) {
            System.out.print(creature.getName() + " ");
            creature.move();
        }

    }
}
