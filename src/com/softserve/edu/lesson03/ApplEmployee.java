package com.softserve.edu.lesson03;

import java.util.Scanner;

public class ApplEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int rate;
		int hours;
		
		Employee[] e = new Employee[3];
		//input
		for(int i=0; i<3; i++) {
			System.out.println("Input information about " + (i+1) + " employee");
			System.out.println("Name: ");
			name = sc.next();
			System.out.println("Rate: ");
			rate = sc.nextInt();
			System.out.println("Hours: ");
			hours = sc.nextInt();
			e[i] = new Employee(name,rate,hours);
			System.out.println(e[i].toString());
		}
		
		e[1].changeRate(10);
		System.out.println(e[1].toString());
		System.out.println("Total Salary: " + Employee.totalSum);
	}
}
