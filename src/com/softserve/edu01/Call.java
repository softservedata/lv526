package com.softserve.edu01;

import java.util.Scanner;

public class Call {
	public static void main(String[] args) {
		
		System.out.println("Input call cost per minute from France");
		Scanner scan = new Scanner(System.in);
		int  c1= scan.nextInt();
		System.out.println("Input call duration");
		int t1 = scan.nextInt();
		int cost1 = c1 * t1;
		System.out.println("Call cost from France is " + cost1);
		
		System.out.println("Input call cost per minute from Germany");
		int c2 = scan.nextInt();
		System.out.println("Input call duration");
		int t2 = scan.nextInt();
		int cost2 = c2 * t2;
		System.out.println("Call cost from France is " + cost2);
		
		System.out.println("Input call cost per minute from Poland");
		int c3 = scan.nextInt();
		System.out.println("Input call duration");
		int t3 = scan.nextInt();
		int cost3 = c3 * t3;
		System.out.println("Call cost from France is " + cost3);
		
		System.out.println("Total cost is " + (cost1 + cost2 + cost3));
	}
	
}
