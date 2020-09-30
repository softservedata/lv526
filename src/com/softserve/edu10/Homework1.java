package com.softserve.edu10;

import java.util.Scanner;

public class Homework1 {
    public static double div(double a, double b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number a= ");
            double a = Double.parseDouble(scan.nextLine());
            System.out.print("Enter second number b= ");
            double b = Double.parseDouble(scan.nextLine());

            System.out.printf("a/b = %.2f", div(a, b));

        }catch (NumberFormatException e){
            System.err.println("Error: invalid input");
        }catch (ArithmeticException e){
            System.err.println("Error: division by 0");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
