package com.softserve.edu01;

import java.util.Scanner;


    //Flower bed is shaped like a circle.
    // Calculate the perimeter and area by entering the radius.
    // Output obtained results.

public class Hw1_Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Flower bed---");

        System.out.println("What is radius of the circle? ");

        System.out.print("Radius = ");
        float r = sc.nextInt();

        float per = (float) (2*Math.PI*r);
        System.out.println("Perimeter = "+per);

        float ar = (float) (Math.PI*r*r);
        System.out.println("Area = "+ar);



    }

}
