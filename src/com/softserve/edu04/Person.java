package com.softserve.edu04;

import java.util.Scanner;


public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;
	
	public static void main(String[] args) {
		
		Person per1 = new Person();
		per1.setFirstName("Oleg");
		per1.setLastName("Koval");
		per1.setBirthYear(1994);
		
		
		Person per2 = new Person("Khrystyn", "Horach");
	    per2.setBirthYear(1999);
	
		Person per3 = new Person();
		
		Person per4 = new Person("Kateryna", "Davydiv");
		per4.setBirthYear(2001);
		
		Person per5 = new Person();
		per5.input();
		
	}
	
	public Person() {
		this.firstName = "Halyna";
		this.lastName = "Mazur";
		this.birthYear = 2000;
	};
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void getAge() {
		int age = 2020-birthYear;
		System.out.println(age);
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		firstName = scan.nextLine();
		System.out.println("Enter last name");
		lastName = scan.nextLine();
		System.out.println("Enter birth year");
		birthYear = scan.nextInt();
	}
	
	public void output() {
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
		System.out.println("Birth Year is " + birthYear);
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
}

	
