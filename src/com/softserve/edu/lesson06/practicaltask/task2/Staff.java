package com.softserve.edu.lesson06.practicaltask.task2;

public abstract class Staff extends Person {

	@Override
	public void print() {
		System.out.println("I am a ...");
	}

	public abstract void salary();
}
