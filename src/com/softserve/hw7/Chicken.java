package com.softserve.hw7;

public class Chicken extends NotFlyingBird {
	private String name;

	public Chicken(String feathers, boolean layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void output() {
		System.out.print(name + " ");
	}
}
