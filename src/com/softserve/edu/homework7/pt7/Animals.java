package com.softserve.edu.pt7;

public class Animals {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cat();
		animal[3] = new Dog();
		
		for (int i = 0; i < animal.length; i++)
		{
			animal[i].voice();
			animal[i].feed();
			System.out.println("--------------------");
		}
	}

}