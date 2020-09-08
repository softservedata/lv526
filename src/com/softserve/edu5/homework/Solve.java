package com.softserve.edu5.homework;

import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        /*
    read 3 float numbers and check:are they all belong to the range [-5,5]
     */
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input float number");
            float a  = sc.nextFloat();
            if(a >= -5 &&  5 >=a){
                System.out.println("Your number IN RANGE");
            }else {
                System.out.println("Your number NOT IN RANGE");
            }
        }

        /*
        read 3 integer numbers and write max and min of them
         */
        System.out.println("Input 3 integer numbers :");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        int max = 0;
        int min = 0;
        if (a > b && a > c) {
            max = a;
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }

        if (b > a && b > c) {
            max = b;
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        }

        if (c > a && c > b) {
            max = c;
            if (a < b) {
                min = a;
            } else {
                min = b;
            }
        }

        System.out.println("Min number = " + min);
        System.out.println("Max number = " + max);
        /*
        redd  number of HTTP Error(400,401,402,..)and write the name of this error (Declare enum HTTPError)
         */
        System.out.print("Choose your Error =");
        HTTP_Error er = HTTP_Error.NOT_FOUND;
        System.out.println(er.nameOfError(sc.nextInt()));
    }
}
