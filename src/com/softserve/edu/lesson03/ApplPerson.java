package com.softserve.edu.lesson03;

import java.util.Scanner;

public class ApplPerson {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		int birthYear;
		
		Person[] p = new Person[5];
		//input
		for(int i=0; i<5; i++) {
			System.out.println("Input information about " + (i+1) + " person");
			p[i] = new Person();
			firstName = sc.next();
			lastName = sc.next();
			birthYear = sc.nextInt();
			p[i].input(firstName, lastName, birthYear);;
		}
		//output
		for(int i=0; i<5; i++) {
			p[i].output();
		}
	}

}
