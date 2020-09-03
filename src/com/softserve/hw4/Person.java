package com.softserve.hw4;

import java.util.Scanner;

public class Person {

	
	
	private String firstName;
	private String lastName;
	private int  birthYear;
	
	public Person() {
		
		firstName = "n";
		lastName = "z";
		birthYear = 2000;
	}
	
	public Person(String firstName, String lastName) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		}
	
public Person(String firstName, String lastName, int birthYear) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		}
	
	public void getAge() {
		
		System.out.println("age of person = " + (2020-birthYear));
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input first name = ");
		String fname = sc.nextLine();
		firstName = fname;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("input last name = ");
		String lname = sc1.nextLine();
		lastName = lname;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("input birth year = ");
		int birthyear = sc2.nextInt();
		birthYear = birthyear;
		
	}
	
	public void output() {
		
		System.out.println("first name = " + firstName);
		System.out.println("last name = " + lastName);
		System.out.println("birth year = " + birthYear);
	}
	
	public void changeName(String fn, String ln) {
		
		firstName = fn;
		lastName = ln;
	}
	public String getFirstName() {
		return firstName;
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
}
