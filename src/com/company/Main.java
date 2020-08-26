package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = sc.nextLine();

        System.out.println("Where are you live " + name);
        String address = sc.nextLine();
        System.out.println("Your name is: " + name + ", you live in: " + address);
        System.out.println("*********************************");

        float a, b;
        System.out.println("Input first number ");
        a = sc.nextInt();
        System.out.println("Input second number ");
        b = sc.nextInt();
        float   c = a + b,
                d = a - b,
                l = a * b,
                m = a / b;

        System.out.println("Your answer is: " + (int)c + ", " + (int)d + ", " + l + ", " + m);

//        System.out.println("Your answer is: " + c);
//        System.out.println("Your answer is: " + d);
//        System.out.println("Your answer is: " + l);
//        System.out.println("Your answer is: " + m);

        System.out.println("*********************************");

        float r;
        System.out.println("Input perimeter: ");
        r = sc.nextInt();

        System.out.println("perimeter is: " + 2 * Math.PI * r);
        System.out.println("Area is: " + Math.PI * (Math.pow(r, 2)));
        System.out.println("*********************************");

        float c1 = 5.0f, c2 = 3.5f, c3 = 28.31f;
        float t1 = 25f, t2 = 10f, t3 = 3f;

//        System.out.println("Input three tariff ");
//        c1 = sc.nextFloat();
//        c2 = sc.nextFloat();
//        c3 = sc.nextFloat();

        float   p1 = c1 * t1,
                p2 = c2 * t2,
                p3 = c3 * t3;

        System.out.println("Separately: " + (int)Math.round(p1) + ", " + (int)Math.round(p2) + ", " + (int)Math.round(p3));
        System.out.println("Together: " + (p1 + p2 + p3));
    }
}
