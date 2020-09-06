package com.company;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    Scanner sc = new Scanner(System.in);

    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){

        Date d=new Date();
        int year=d.getYear();
        int currentYear=year+1900;
        return currentYear - birthYear;
    }

    public void input(){
        System.out.println("Input first name ");
        this.firstName = sc.nextLine();
        System.out.println("Input last name ");
        this.lastName = sc.nextLine();
        System.out.println("Input your  birthYear ");
        this.birthYear = sc.nextInt();
    }

    public void output(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person [" +
                "FirstName = '" + firstName + '\'' +
                ", LastName = '" + lastName + '\'' +
                ", Age = " + this.getAge() +
                ']';
    }

    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

}

class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();

        person3.changeName("Ahmed", "Ivanov");
        person4.changeName("Joel", "Eleven");
        person5.changeName("Joli", "Bro");

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
