package com.softserve.javacore.hometask1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter standard unit for country1");
        Scanner sc1 = new Scanner(System.in);
        int country1 = sc1.nextInt();

        System.out.println("Enter standard unit for country2");
        Scanner sc2 = new Scanner(System.in);
        int country2 = sc2.nextInt();

        System.out.println("Enter standard unit for country3");
        Scanner sc3 = new Scanner(System.in);
        int country3 = sc3.nextInt();

        System.out.println("Enter talk 1 duration (minutes)");
        Scanner sc4 = new Scanner(System.in);
        int time1 = sc4.nextInt();

        System.out.println("Enter talk 2 duration (minutes)");
        Scanner sc5 = new Scanner(System.in);
        int time2 = sc5.nextInt();

        System.out.println("Enter talk 3 duration (minutes)");
        Scanner sc6 = new Scanner(System.in);
        int time3 = sc6.nextInt();

        int paymentCountry1 = country1 * time1;
        int paymentCountry2 = country2 * time2;
        int paymentCountry3 = country3 * time3;
        int paymentTotal = paymentCountry1 + paymentCountry2 + paymentCountry3;

        System.out.println("Calculation for talk with country1 " + paymentCountry1);
        System.out.println("Calculation for talk with country2 " + paymentCountry2);
        System.out.println("Calculation for talk with country3 " + paymentCountry3);
        System.out.println("Total for all talks " + paymentTotal);

    }
}
