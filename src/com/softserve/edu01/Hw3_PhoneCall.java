package com.softserve.edu01;

import java.util.Scanner;

    //Phone calls from three different countries are с1, с2 and с3 standard units per minute.
    // Talks continued t1, t2 and t3 minutes.
    // How much computer will count for each call separately and all talk together?
    // Input all source data from console, make calculations and output to the screen.

public class Hw3_PhoneCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c1 = " UA";
        String c2 = " UK";
        String c3 = " USA";

        int t1, t2, t3;

        System.out.print("The call from" + c1 + " continued: ");
        t1 = sc.nextInt();

        System.out.print("The call from" + c2 + " continued: ");
        t2 = sc.nextInt();

        System.out.print("The call from" + c3 + " continued: ");
        t3 = sc.nextInt();

        int s = t1 + t2 + t3;
        System.out.println("In sum = " + s + " min.");


    }
}
