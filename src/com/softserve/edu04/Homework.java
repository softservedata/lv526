package com.softserve.edu04;

import java.util.Scanner;


public class Homework {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        System.out.println("Input info about Person 1");
        p1.input();
        System.out.println("-----------------------------------------");

        System.out.println("Input info about Person 2");
        p2.input();
        System.out.println("-----------------------------------------");

        System.out.println("Input info about Person 3");
        p3.input();
        System.out.println("-----------------------------------------");

        System.out.println("Input info about Person 4");
        p4.input();
        System.out.println("-----------------------------------------");

        System.out.println("Input info about Person 5");
        p5.input();
        System.out.println("-----------------------------------------");

        System.out.println("Output info about Person 1: "+p1.output());
        System.out.println("Output info about Person 2: "+p2.output());
        System.out.println("Output info about Person 3: "+p3.output());
        System.out.println("Output info about Person 4: "+p4.output());
        System.out.println("Output info about Person 5: "+p5.output());

        System.out.println("-----------------------------------------");

        System.out.println("Age person 1 = "+p1.getAge());

        Scanner sc = new Scanner(System.in);
        System.out.print("Input new First name for Person 2: ");
        String fn = sc.nextLine();
        System.out.print("Input new Last name for Person 2: ");
        String ln = sc.nextLine();

        p2.changeName(fn,ln);
        System.out.println("Output new info about Person 2: "+p2.output());
        System.out.println("------------------end----------------------");

    }
}
