package com.softserve.edu.pt7;

public class Dog implements Animal{
	
	@Override
	public void voice() {
		System.out.println("Gav, gav, gav...");
	}
	@Override
	public void feed() {
		System.out.println("Feed me!");
	}	
}