package com.softserve.hw7;

public class Penguin extends NotFlyingBird {
	private String name;

	public Penguin(String feathers, boolean layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void output() {
		System.out.print(name + " ");
	}
}
