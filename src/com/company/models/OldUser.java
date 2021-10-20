package com.company.models;

import java.util.Random;

public class OldUser {
    public String firstName;
    public String lastName;
    public int age;
    public int id;

    public OldUser(User myFirstName, String myLastName, int myAge) {
//        firstName = myFirstName;
        lastName = myLastName;
        age = myAge;
        id = new Random().nextInt(1000000);
    }

    OldUser(String myFirstName, String myLastName, int myAge, int myID) {
        firstName = myFirstName;
        lastName = myLastName;
        age = myAge;
        id = myID;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OldUser) {
            OldUser user = (OldUser) obj;
            return firstName.equals(user.firstName)
                    && lastName.equals(user.lastName);
        } else {
            return false;
        }
    }
}
