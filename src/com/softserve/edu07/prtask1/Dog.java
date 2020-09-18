package com.softserve.edu07.prtask1;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("Bark!");
	}
	@Override
	public void feed() {
		System.out.println("I eat meat");
	}
}
