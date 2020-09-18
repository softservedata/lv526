package com.softserve.edu06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
	int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	System.out.println("Enter number of month");
	Scanner scan = new Scanner(System.in);
	int month = scan.nextInt();
	scan.close();
	System.out.println("This month has " + daysOfMonth[month-1] + " days.");
	
	}
}
	
	

	
