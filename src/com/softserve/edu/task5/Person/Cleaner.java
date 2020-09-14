package com.softserve.edu.task5.Person;

public class Cleaner extends Staff{
    private final String TYPE_PERSON;

    public Cleaner() {
        TYPE_PERSON = "Cleaner";
    }
    public void print(){
        System.out.println("I am a " + TYPE_PERSON);
    }
    public void salary(){
        System.out.println("My salary is: 300$");
    }
}
