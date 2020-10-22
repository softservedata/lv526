package com.softserve.edu05;

enum dogBreed {
	BULLDOG, TERRIER, STAFFORD;
}

public class Dog {
	private String name;
	private dogBreed breed;
	private int age;
	
	public Dog(String name, dogBreed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public dogBreed getBreed() {
		return breed;
	}

	public void setBreed(dogBreed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [" + "name = " + name 
				+ ", breed = " + breed.name().toLowerCase() 
				+ ", age = " + age 
				+ "]";
	}
	public Dog isDuplicateNames(Dog otherDogName) {
		if (getName().equals(otherDogName.getName()))
			return this;
		else
			return this;
	}

		
}
