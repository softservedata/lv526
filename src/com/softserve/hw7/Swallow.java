package com.softserve.hw7;

public class Swallow extends FlyingBird {
	private String name;

	public Swallow(String feathers, boolean layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;

	}
	public void output() {
		System.out.print(name + " ");
	}
}
