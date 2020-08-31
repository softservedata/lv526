package com.softserve.edu.lesson01.countries;

import java.util.Scanner;

public class Countries {
	public static void main(String[] args) {
		double c1;
		double c2;
		double c3;
		int t1;
		int t2;
		int t3;
		Scanner sc = new Scanner(System.in);
		System.out.print("At c1 one minutes cost: ");
		c1 = sc.nextDouble();
		System.out.print("At c2 one minutes cost: ");
		c2 = sc.nextDouble();
		System.out.print("At c3 one minutes cost: ");
		c3 = sc.nextDouble();
		System.out.print("t1 time: ");
		t1 = sc.nextInt();
		System.out.print("t2 time: ");
		t2 = sc.nextInt();
		System.out.print("t3 time: ");
		t3 = sc.nextInt();
		
		double firstcost;
		double secondcost;
		double thirdcost;
		double total;
		firstcost = c1*t1;
		secondcost = c2*t2;
		thirdcost = c3*t3;
		total = firstcost + secondcost + thirdcost;
		System.out.println("First contry cost: " + firstcost);
		System.out.println("Second contry cost: " + secondcost);
		System.out.println("Third contry cost: " + thirdcost);
		System.out.println("Total price: " + total);
	}
	
}

