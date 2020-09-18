package com.softserve.edu07.prtask1;

public class ApplAnimal {

	public static void main(String[] args) {
		Animal[] animals = {
				new Cat(),
				new Dog(),
				new Cat(),
				new Dog()
		};
		
		for (Animal i: animals) {
			i.voice();
			i.feed();
		}
	}

}
