package com.softserve.edu.lesson04.homework;

import java.util.Scanner;

enum Breed {
	BULLDOG("Buldog"), AKITA("Akita"), PUG("Pug");

	private String breed;

	private Breed(String breed) {
		this.breed = breed;
	}

	public String getBread() {
		return breed;
	}
}

public class Dog {
	private String name;
	private String breed;
	private int age;

	private static Scanner scanner;

	static {
		scanner = null;
	}

	public Dog() {
		this.name = "";
		this.breed = "";
		this.age = 0;
	}

	//
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public static Dog readFromKeyboard() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		//
		String name;
		int age;
		String breed;
		//
		System.out.print("Enter dog name - ");
		name = scanner.nextLine();
		System.out.print("Enter dog age - ");
		age = scanner.nextInt();
		scanner.nextLine();
		try {
			System.out.print("Enter dog breed - ");
			breed = scanner.nextLine().toUpperCase();
			breed = Breed.valueOf(breed).getBread();
		} catch (Exception e) {
			System.out.println("Wrong breed!");
			breed = "Default";
		}

		return new Dog(name, breed, age);

	}

	public static void closeScanner() {
		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
	}

	public boolean checkName(String name) {
		return this.name.equals(name) ? true : false;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Input 1 dog");
		Dog d1 = Dog.readFromKeyboard();
		System.out.println("Input 2 dog");
		Dog d2 = Dog.readFromKeyboard();
		System.out.println("Input 3 dog");
		Dog d3 = Dog.readFromKeyboard();
		Dog.closeScanner();

		System.out.println("Same name - " + ((d1.checkName(d2.name)) || (d1.checkName(d3.name)) ? true : false));

		String name = null;
		int maxAge = 0;
		if (d1.age > maxAge) {
			maxAge = d1.age;
			name = d1.name;
		}
		if (d2.age > maxAge) {
			maxAge = d2.age;
			name = d2.name;
		}
		if (d3.age > maxAge) {
			maxAge = d3.age;
			name = d3.name;
		}
		System.out.println("Oldest dog is - " + name + " it is - " + maxAge + " years old");

		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
	}
}
