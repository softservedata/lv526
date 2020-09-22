package com.softserve.edu.pt6.two;

public class Teacher extends Staff {
	
	public final String TYPE_PERSON;

	public Teacher() {
		TYPE_PERSON = "Teacher";
	}
	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}
	@Override
	public void salary() {
		System.out.println("Salary : 4000$");

	}

}
