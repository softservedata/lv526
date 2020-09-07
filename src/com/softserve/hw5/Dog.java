package com.softserve.hw5;

public class Dog {
 
	
	String name;
	Breed breed;
	int age;
	
	public Dog(String name, Breed breed, int age) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}
