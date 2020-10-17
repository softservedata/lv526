package com.softserve.edu.task8;

import java.util.Scanner;

public class Pwork1 {
    public int areaRectangle() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter width rectangle ");
        int a = scanner.nextInt();
        System.out.print("Please enter height rectangle ");
        int b = scanner.nextInt();

        int x = 0;
        if (a < 0 || b < 0) throw new ArithmeticException();
        else {
            x = a * b;
        }
        return x;
    }

    public static void main(String[] args) {
        Pwork1 pw1 = new Pwork1();
        System.out.println(pw1.areaRectangle());
    }
}