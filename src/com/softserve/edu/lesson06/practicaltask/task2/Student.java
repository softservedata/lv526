package com.softserve.edu.lesson06.practicaltask.task2;

public class Student extends Person {

	private final String TYPE_PERSON = "Student";

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	public void print() {
		System.out.println("I'm a Student");
	}
}
