package com.softserve.edu.lesson06.practicaltask.task1;

public class ApplAnimal {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];

		for (int i = 0; i < animal.length; i++) {
			animal[i] = new Cat();
			animal[((animal.length - i) - 1)] = new Dog();
		}
		for (int i = 0; i < animal.length; i++) {
			System.out.println("New Animal");
			animal[i].feed();
			animal[i].voice();
			System.out.println("\n");
		}
	}

}
