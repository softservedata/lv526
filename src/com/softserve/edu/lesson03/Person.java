package com.softserve.edu.lesson03;

import java.util.Calendar;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person() {};
	public Person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int GetAge() {
		int carrentYear = Calendar.getInstance().get(Calendar.YEAR);
		return (carrentYear - birthYear);
	}
	public void input(String firstName,String lastName,int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public void output() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Year of birth: " + birthYear);
	}
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
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
