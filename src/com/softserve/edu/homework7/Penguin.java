package com.softserve.edu.homework7;

public class Penguin extends NonFlyingBird{
	public Penguin() {
		super (false);
	}
	@Override
	public String toString() {
		return "Penguin " + super.toString();
	}


}
