package com.softserve.edu6.Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
    Ask user to enter the number of month. Read
    the value and write the amount of days
    in this month(create array with amount
    days of each month)
     */

        Scanner sc = new Scanner(System.in);
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Input number of month");
        System.out.println("Days in this month " + month[sc.nextInt() - 1]);

        /*
        Enter 10 integer numbers. Calculate the sum of first 5 elements
        if they are positive or product
        of last 5 element in the other case.
         */
        int[] numbers = new int[10];
        int product = 1;
        int sum = 0;
        System.out.println("Input 10 numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array :" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum : " + sum);
        for (int i = numbers.length - 1; i > 4; i--) {
            product = product * numbers[i];
        }
        System.out.println("Product : " + product);

        /*
        Enter 5 integer numbers. Find
        1) position of second positive number;
        2) minimum and its position in the array;
         */
        System.out.println("Input 5 numbers : ");
        int[] n = new int[5];
        int position1 = 0;
        int min = 0;
        int position2 = 1;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
                min = n[0];
            for (int j = 1; j <n.length ; j++) {

                if(min>n[j]){
                    position2 = j+1; //that like we count not from 0 we count from 1
                    min = n[j];
                }
            }

            if (n[i] > 0) {
                position1 += 1;

                if (position1 == 2) {
                    System.out.println("Second positive number " +
                            "is on position = " + (i + 1));
                }

            } else if (position1 == 1 && i == n.length - 1) {
                System.out.println("Only 1 positive number ");

            } else if (position1 == 0 && i == n.length - 1) {
                System.out.println("No positive values");
            }

        }
        System.out.println("Min = " + min + " Position = " + position2);
        /*
        Organize entering integers until the first negative number.
        Count the product of all entered even numbers
         */

         boolean work = true;
        int product1 = 1 ;
        int a  ;
        System.out.println("\n\t  Organize entering integers until the first negative number.\n" +
                "        Count the product of all entered even numbers");
        while (work){
            System.out.println("Input number");
           a = sc.nextInt();
            if (0 > a){
                System.out.println("you input negative number");
                work = false;

            }
            if (a %2 == 0){
                product1 *= a;
            }
        }
        System.out.println("Product of all entered even numbers = " + product1);




    }
}
