package chapter6_OOP.persons;

import chapter6_OOP.persons.Person;

public abstract class Staff extends Person {

    @Override
    public void print() {
        System.out.println(" I am a ... ");
    }

    public abstract void salary();
}
