package com.softserve.edu.homework5tests;

import org.junit.Test;
import org.junit.Assert;
import com.softserve.edu.homework5.Breed;
import com.softserve.edu.homework5.Breed.Dog;

public class DogTest {

	@Test
	public void CheckIdenticalNamesFound() {
		Dog[] dogs = { new Dog(Breed.BULLDOG, "Rolf", 4), 
				       new Dog(Breed.DALMATIAN, "Zak", 3),
				       new Dog(Breed.CHIHUAHUA, "Molly", 6) };
		boolean actual;
		
		actual = Dog.isDuplicateNames(dogs);
		Assert.assertTrue(!actual);
	}
	@Test
	public void CheckIdenticalNamesNotFound() {

		Dog[] dogs = { new Dog(Breed.BULLDOG, "Rolf", 4), 
				       new Dog(Breed.DALMATIAN, "Zak", 3),
				       new Dog(Breed.CHIHUAHUA, "Molly", 6) };
		boolean actual;
		actual = Dog.isDuplicateNames(dogs);
		Assert.assertFalse(actual);
	}
	@Test
	public void CheckingFoundOldest() {

		Dog[] dogs = { new Dog(Breed.BULLDOG, "Rolf", 4), 
				       new Dog(Breed.DALMATIAN, "Zak", 3),
				       new Dog(Breed.CHIHUAHUA, "Molly", 6) };
		Dog actual;
		Dog expected;
		
		expected = new Dog(Breed.CHIHUAHUA,"Molly", 6);
		actual = Dog.getOldest(dogs);
		Assert.assertEquals(expected, actual);
	}

}
