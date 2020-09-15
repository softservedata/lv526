package com.softserve.edu.lesson06.practicaltask.task2;

public abstract class Person {
	private String name;

	public abstract void print();

	public abstract String getTYPE_PERSON();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void salary();

}
