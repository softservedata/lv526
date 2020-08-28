package com.softserve.edu01;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

//        Define integer variables a and b. Read values a and b from Console and calculate:
//        a + b
//        a - b
//        a * b
//        a / b.
//                Output obtained results.

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

        //Output question “How are you?“.
        // Define string variable answer.
        // Read the value answer and output: “You are (answer)".

        Scanner ssc = new Scanner(System.in);

        System.out.println("Hey, whats up?");
        System.out.print("I'm ");
        String answer = ssc.nextLine();
        System.out.println("You are " + answer);
    }
}
