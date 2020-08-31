package com.softserve.edu04;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName= lastName;
    }

    public int getAge(){
        return 2020-birthYear;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First name: ");
        firstName = sc.nextLine();
        System.out.print("Input Last name: ");
        lastName = sc.nextLine();
        System.out.print("Input Birth year: ");
        birthYear= sc.nextInt();

    }

    public String output(){
        return "Person [First name=" + firstName
                + ", last name=" + lastName
                + ", birth year=" + birthYear
                + "]";
    }

    public String changeName(String fn,String ln){
        this.firstName=fn;
        this.lastName= ln;
        return fn + ln;
    }
}
