package com.softserve.edu.pt7;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("Meow, meow, meow...");
	}

	@Override
	public void feed() {
		System.out.println("Feed me!");
	}

}