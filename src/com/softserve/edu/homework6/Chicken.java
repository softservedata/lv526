package com.softserve.edu.homework6;

public class Chicken extends NonFlyingBird {

	public Chicken() {
		super(true);

	}

	@Override
	public String toString() {
		return "Chicken " + super.toString();
	}

}