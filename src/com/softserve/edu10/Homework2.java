package com.softserve.edu10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {
    public static void readNumber(int start, int end) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter integer number ");
            int input = scan.nextInt();
            if (input >= start && input <= end) {
                System.out.printf("%d is in range [%d, %d]", input, start, end);
            } else {
                System.out.printf("%d is not in range [%d, %d]", input, start, end);
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input");
        }

    }

    public static void main(String[] args) {
        readNumber(-7, 9);
    }
}

