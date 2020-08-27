package com.softserve.edu04;

public class ApplPerson {
    public static void main(String[] args) {
        System.out.println("0. count = " + Person.getCount());
        Person person0 = new Person();
        System.out.println("1. count = " + Person.getCount());
        Person person = new Person();
        //
        /*-
        person.age = 21;
        person.firstName = "Ivan";
        person.lastName = "Ivanov";
        */ 
        //
        System.out.println("person.getFirstName() = " + person.getFirstName());
        Person person2 = new Person("Petro", "Petrov", 22);
        System.out.println("person2.getFirstName() = " + person2.getFirstName());
        System.out.println("count = " + Person.getCount());
        //
        //System.out.println("person = " + person.toString());
        System.out.println("person = " + person);
    }
}
