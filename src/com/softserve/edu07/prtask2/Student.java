package com.softserve.edu07.prtask2;

public class Student extends Person{

	private final String TYPE_PERSON = "Student";
	
	public Student() {
		System.out.println(TYPE_PERSON);
	}
	
	public void print() {
		System.out.println("I am a student");
	}
}
