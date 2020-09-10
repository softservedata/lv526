package com.softserve.edu04;

import java.util.Scanner;

public class ApplEmployee {
	
	public static void main (String[] args) {
		String currentName;
		int currentRate;
		int currentHours;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input employee 1 name: ");
		currentName = sc.nextLine();
		System.out.print("Input employee 1 rate: ");
		currentRate = sc.nextInt();
		sc.nextLine();
		System.out.print("Input employee 1 hours: ");
		currentHours = sc.nextInt();
		sc.nextLine();
		Employee empl1 = new Employee(currentName, currentRate, currentHours);
		//
		System.out.print("Input employee 2 name: ");
		currentName = sc.nextLine();
		System.out.print("Input employee 2 rate: ");
		currentRate = sc.nextInt();
		sc.nextLine();
		System.out.print("Input employee 2 hours: ");
		currentHours = sc.nextInt();
		sc.nextLine();
		Employee empl2 = new Employee(currentName, currentRate, currentHours);
		//
		System.out.print("Input employee 3 name: ");
		currentName = sc.nextLine();
		System.out.print("Input employee 3 rate: ");
		currentRate = sc.nextInt();
		sc.nextLine();
		System.out.print("Input employee 3 hours: ");
		currentHours = sc.nextInt();
		sc.nextLine();
		Employee empl3 = new Employee(currentName, currentRate, currentHours);
		// Total Salary
		//
		System.out.println("Employee 1: " + empl1);
		System.out.println("Employee 2: " + empl2);
		System.out.println("Employee 3: " + empl3);
		
		sc.close();
	}
}
