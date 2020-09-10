package com.softserve.edu04;

import java.util.Scanner;

public class Person {

	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	Scanner sc = new Scanner(System.in);
	
	public Person() {
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getAge() {
		int age = 2020 - this.birthYear;
		return age;
	}
		
	public void input() {
		System.out.print("Type first name: ");
		this.firstName = sc.nextLine();
		System.out.print("Type last name: ");
		this.lastName = sc.nextLine();
		System.out.print("Type birthday year: ");
		this.birthYear = sc.nextInt();
		
	}
	
	
	public void output() {
		System.out.println(this.toString());
	}	 
		@Override
	public String toString() {
			return "Person"
					+ "new name is " + firstName + " " + lastName + " " + "age is " + this.getAge() + " years old;";
	}
		
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
}