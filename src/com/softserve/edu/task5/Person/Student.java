package com.softserve.edu.task5.Person;

public class Student extends Person{
    private final String TYPE_PERSON;

    public Student() {
        TYPE_PERSON = "Student";
    }

    public void print(){
        System.out.println("I am a " + TYPE_PERSON);
    }
}
