package com.softserve.edu.task8;

import java.util.Scanner;

public class Hwork1 {

    private double div(double a, double b) throws ArithmeticException {
        double result = 0;
        if (a == 0 || b == 0) throw new ArithmeticException();
        else {
            result = a / b;
        }
        return result;
    }

    private int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            if (number <= start || number >= end) {
                throw new ArrayIndexOutOfBoundsException("{This number is not in the range}");
            } else {
                number = number;
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.err.println(ar);
        }
        return number;
    }

    public static void main(String[] args) {
        Hwork1 hw1 = new Hwork1();
        System.out.println(hw1.div(8.1, 3.5));
        System.out.println(hw1.readNumber(6 , 10));
    }
}