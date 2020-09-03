package com.softserve.hw1;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("input int: a = ");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("input int: b = ");
		int b = sc1.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println("//////////////////////////////////");
		System.out.print("How are you?");
		Scanner sc2 = new Scanner(System.in);
		String az = sc2.nextLine();
		System.out.println("You are " + az + ".");
		System.out.println("//////////////////////////////////");

		final double Pi = 3.14;

		Scanner sc3 = new Scanner(System.in);
		System.out.print("input int: Radius = ");
		int r = sc3.nextInt();
		System.out.println("square = " + (Pi * Math.pow(r, 2)));
		System.out.println("perimeter = " + (2 * Pi * r));
		System.out.println("//////////////////////////////////");

		System.out.print("What is your name?");
		Scanner nm = new Scanner(System.in);
		String name = nm.nextLine();

		System.out.print("Where are you live, " + name + "?");
		Scanner ad = new Scanner(System.in);
		String address = ad.nextLine();

		System.out.println("//////////////////////////////////");

		Scanner cc1 = new Scanner(System.in);
		System.out.print("input int: c1 = ");
		int c1 = cc1.nextInt();
		Scanner cc2 = new Scanner(System.in);
		System.out.print("input int: c2 = ");
		int c2 = cc2.nextInt();
		Scanner cc3 = new Scanner(System.in);
		System.out.print("input int: c3 = ");
		int c3 = cc3.nextInt();

		Scanner tt1 = new Scanner(System.in);
		System.out.print("input int: t1 = ");
		int t1 = tt1.nextInt();
		Scanner tt2 = new Scanner(System.in);
		System.out.print("input int: t2 = ");
		int t2 = tt2.nextInt();
		Scanner tt3 = new Scanner(System.in);
		System.out.print("input int: t3 = ");
		int t3 = tt3.nextInt();
		System.out.print((" for 1 call: ") + (t1 * c1) + '\n' + (" for 2 call ") + (t2 * c2) + '\n' + (" for 3 call ")
				+ (t3 * c3) + '\n' + (" for all calls ") + ((t1 * c1) + (t2 * c2) + (t3 * c3)));
    }
}
