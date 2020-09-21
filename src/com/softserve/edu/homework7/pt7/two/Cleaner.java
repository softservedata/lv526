package com.softserve.edu.pt7.two;

public class Cleaner extends Staff {
	
	public final String TYPE_PERSON;

	public Cleaner() {
		TYPE_PERSON = "Cleaner";
	}
	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}
	@Override
	public void salary() {
		System.out.println("Salary : 5000 grn");

	}
}
