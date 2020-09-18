package com.softserve.edu07.prtask2;

public class Teacher extends Staff{
	
	private final String TYPE_PERSON = "Teacher";
	
	public Teacher() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	public void print() {
		System.out.println("I am a teacher");
	}
	
	@Override
	public double salary() {
		return 9000;
	}
}