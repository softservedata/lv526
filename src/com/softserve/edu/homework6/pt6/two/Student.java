package com.softserve.edu.pt6.two;

public class Student extends Person {
	
	private final String TYPE_PERSON;

	public Student() {
		TYPE_PERSON = "Student";
	}
	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + ", I do not have a salary" );
	}

	public void salary() {
		System.out.println("I do not hava a salary");
	}
}
