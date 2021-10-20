package com.company;

//import com.company.inh.*;

import com.company.inh2.*;

public class Main {
    public static void main(String[] args) {
        DogInterface dog = new Dog("Bobik", 1234);
        CatInterface cat = new Cat("Murzik", 5678);
        Fox fox = new Fox("fox", 5678);

        dog.woof();
        cat.meow();
        fox.woof();
        fox.meow();

        dog.sleep();
        cat.sleep();
        fox.sleep();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Animal animal = new Animal("Name", 123);

//        User user1 = new User("Ivan", "Ivanov", 12);
//        User user2 = new User("Ivan", "Ivanov", 13);
//
//        System.out.println(user1.toString());
//        System.out.println(user2);
//
//        System.out.println(user1.getFirstName() + " " + user1.getLastName());
//        System.out.println(user1.equals(user2));
    }
}
