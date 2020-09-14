package com.softserve.edu.task5.Person;

public class Teacher extends Staff{
    private final String TYPE_PERSON;

    public Teacher() {
        TYPE_PERSON = "Teacher";
    }
    public void print(){
        System.out.println("I am a " + TYPE_PERSON);
    }
    public void salary(){
        System.out.println("My salary is: 350$");

    }
}
