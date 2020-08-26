package com.softserve.javacore.hometask1;

import java.util.Scanner;

/**Create Console Application project in Java.
In method main() write code for solving next tasks:
Define integer variables a and b. Read values a and b from Console and calculate:
a + b
a - b
a * b
a / b.
Output obtained results.
 */

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Please insert value for a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please insert value for b");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
