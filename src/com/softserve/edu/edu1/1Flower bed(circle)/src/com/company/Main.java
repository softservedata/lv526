package com.company;

import java.util.Scanner;

public class Main {

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
