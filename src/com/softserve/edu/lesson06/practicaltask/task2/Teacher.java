package com.softserve.edu.lesson06.practicaltask.task2;

public class Teacher extends Staff {

	private final String TYPE_PERSON = "Teacher";

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	public void print() {
		System.out.println("I'm a " + TYPE_PERSON);
	}

	@Override
	public void salary() {
		System.out.println("Big money");
	}
}
