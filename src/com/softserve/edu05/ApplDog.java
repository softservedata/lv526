package com.softserve.edu05;

public class ApplDog {
	public static void main (String[] args) {
		
		Dog dog1 = new Dog("Lord", dogBreed.BULLDOG, 1);
		Dog dog2 = new Dog("Olaf", dogBreed.TERRIER, 7);
		Dog dog3 = new Dog("Olaf", dogBreed.STAFFORD, 3);
		
		Dog duplicate = dog1.isDuplicateNames(dog2);
		duplicate = duplicate.isDuplicateNames(dog3);
		
		System.out.println("Duplicate names: " + duplicate);
	}
}
