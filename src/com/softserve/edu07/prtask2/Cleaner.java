package com.softserve.edu07.prtask2;

public class Cleaner extends Staff{

	private final String TYPE_PERSON = "Cleaner";
	
	public Cleaner() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	public void print() {
		System.out.println("I am a cleaner");
	}
	
	@Override
	public double salary() {
		return 7000;
	}
}
