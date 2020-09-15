package com.softserve.hw7;

public class NotFlyingBird extends Bird {

	public NotFlyingBird(String feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("This bird not fly");

	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

}
