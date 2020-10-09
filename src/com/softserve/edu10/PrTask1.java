package com.softserve.edu10;

import java.util.Scanner;

public class PrTask1 {

    public static int squareRectangle(int a, int b) throws ArithmeticException{
        if ((a < 0) || (b < 0)) {
            throw new ArithmeticException("Please check entered values. Length and width should be grater than 0.");
        }
        return a * b;
    }

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rectangle length");
        int length = scan.nextInt();
        System.out.println("Enter rectangle width");
        int width = scan.nextInt();
        scan.close();
        
        System.out.println("Rectangle square is " + squareRectangle(length, width));


    }
}
