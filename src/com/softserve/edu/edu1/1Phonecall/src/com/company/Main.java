package com.company;

import java.util.Scanner;

public class Main {

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
