package com.softserve.edu.homework4;

public class Person {

private String firstName;
   private String lastName;
   private int birthYear;
   
   public Person() {		
	   this.firstName = "Taras";
	   this.lastName = "Petrenko";
	   this.birthYear = 25;
}
public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
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
	public void getOutput() {
		System.out.println("First name - " + firstName);
		System.out.println("Last name -  " + lastName);
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void getAge() {
		int age = 2020-birthYear;
		System.out.println("Age - " + age);
	}
	public void input(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
