package com.softserve.edu4.homework;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void getAge(){
        int age = 2020 - this.birthYear;
        System.out.println("This person have " + age + " years");
    }
    public void changeName(String fn , String fn1){
        this.firstName = fn;
        this.lastName = fn1;
        System.out.println("Your new name " + fn);
        System.out.println("Your new surname " + fn1);
    }
    public void output(){
        System.out.println("Name: " + firstName + " Surname: " + lastName);
        System.out.println("Birthday " + birthYear);
        System.out.println();
    }
    public void input(String fn,String ln ,int by){
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = by;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();


        p1.input("Yura","Sergiyenko",1994);
        p1.changeName("Yuriy","Sergi");
        p1.getAge();
        p1.output();


        p2.input("Yulya","Ostapenko",2010);
        p2.changeName("Yuliya","Stapenko");
        p2.getAge();
        p2.output();

        p3.input("Zakhar","Verem",1999);
        p3.changeName("Zakhariy","Veremchuk");
        p3.getAge();
        p3.output();

        p4.input("Sergo","Loven",1997);
        p4.changeName("Sergiy","Lovenko");
        p4.getAge();
        p4.output();

        p5.input("Volodya","Plion",1994);
        p5.changeName("Volodumur","Plionenko");
        p5.getAge();
        p5.output();

    }
}
