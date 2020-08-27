package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("------Welcome------");
        System.out.println("My typuy calculator");


        System.out.print("Enter first  number: ");
        a = sc.nextInt();

        System.out.print("Second  number: ");
        b = sc.nextInt();

        int c = a + b;
        System.out.println("a + b = " + c);
        int m = a - b;
        System.out.println("a - b = " + m);
        int x = a * b;
        System.out.println("a * b = " + x);
        int d = a / b;
        System.out.println("a / b = " + d);

        Scanner ssc = new Scanner(System.in);

        System.out.println("Hey, whats up?");
        System.out.print("I'm ");
        String answer=ssc.nextLine();
        System.out.println("You are "+ answer);

    }
}
