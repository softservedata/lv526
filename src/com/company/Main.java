package com.company;

import java.util.Scanner;

public class Main {
    public static void separator(String taskName) {
        System.out.println("\n\n***************** " + taskName + " ****************\n");
    }

    public static void question() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("Where are you live " + name + "? ");
        String address = sc.nextLine();

        System.out.print("Your name is: " + name + ", you live in: " + address);
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);

        float a, b;

        System.out.print("Input first number: ");
        a = sc.nextFloat();
        System.out.print("Input second number: ");
        b = sc.nextFloat();

        float   c = a + b,
                d = a - b,
                l = a * b,
                m = a / b;

        System.out.print("Your answer is: ");
        System.out.print(" " + String.format("%.2f",c));
        System.out.print(" " + String.format("%.2f",d));
        System.out.print(" " + String.format("%.2f",l));
        System.out.print(" " + String.format("%.2f",m));
    }

    public static void perimeterAndAreaOfCircle() {
        Scanner sc = new Scanner(System.in);

        float r;

        System.out.print("Input radius: ");
        r = sc.nextFloat();

        System.out.println("Perimeter is: " + String.format("%.2f", 2 * Math.PI * r));
        System.out.print("Area is: " + String.format("%.2f", Math.PI * (Math.pow(r, 2))));
    }

    public static void callTariff() {
        Scanner sc = new Scanner(System.in);

        float c1 = 3.45f, c2 = 5.23f, c3 = 6.23f;
        float t1, t2, t3;

        System.out.println("Input three times ");
        t1 = sc.nextFloat();
        t2 = sc.nextFloat();
        t3 = sc.nextFloat();

        float   p1 = c1 * t1,
                p2 = c2 * t2,
                p3 = c3 * t3;

        System.out.println("Singly: " + (float)Math.round(p1) + ", " + (float)Math.round(p2) + ", " + (float)Math.round(p3));
        System.out.println("Together: " + (p1 + p2 + p3));
    }

    public static void main(String[] args) {
        separator("Question");
        question();

        separator("Calculator");
        calculator();

        separator("Perimeter And Area Of Circle");
        perimeterAndAreaOfCircle();

        separator("Call Tariff");
        callTariff();
    }
}
