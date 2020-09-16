package com.softserve.edu.task2.person;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    Scanner sc = new Scanner(System.in);

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {

        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        return currentYear - birthYear;
    }

    public void input() {
        System.out.println("Input first name ");
        this.firstName = sc.nextLine();
        System.out.println("Input last name ");
        this.lastName = sc.nextLine();
        System.out.println("Input your  birthYear ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person [" +
                "FirstName = '" + firstName + '\'' +
                ", LastName = '" + lastName + '\'' +
                ", BirthYear = '" + birthYear + '\'' +
                ", Age = " + this.getAge() +
                ']';
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}

class Main {

    public static void main(String[] args) {

        Person[] persons = {
                new Person(),
                new Person(),
                new Person(),
                new Person(),
                new Person()
        };

        for (int i = 0; i < persons.length; i++) {
            persons[i].input();
            persons[2].changeName("Ahmed", "Ivanov");
            persons[3].changeName("Joel", "Eleven");
            persons[4].changeName("Joli", "Bro");
            persons[i].output();
        }
    }
}
