package com.softserve.edu07.prtask2;

public abstract class Staff extends Person{

	public void print() {
		System.out.println("I am a staff member");
	}
	
	public abstract double salary();
}
