package com.softserve.hw041;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    
    @Test
    public void checkDuplicateNamesFound() {
        Dog[] dogs = {
                new Dog("Miki", Breed.TERRIER, 4),
                new Dog("John", Breed.HOUND, 7),
                new Dog("Bob", Breed.BASENJI, 8),
                new Dog("John", Breed.AKITA, 1),
                new Dog("Bred", Breed.BULLDOG, 5) };
        boolean actual;
        //
        actual = Dog.isDuplicateNames(dogs);
        Assert.assertTrue(actual);
    }
    
    @Test
    public void checkDuplicateNamesNotFound() {
        Dog[] dogs = {
                new Dog("Miki", Breed.TERRIER, 4),
                new Dog("John", Breed.HOUND, 7),
                new Dog("Bob", Breed.BASENJI, 8),
                new Dog("Tuzik", Breed.AKITA, 1),
                new Dog("Bred", Breed.BULLDOG, 5) };
        boolean actual;
        //
        actual = Dog.isDuplicateNames(dogs);
        Assert.assertFalse(actual);
    }
    
    @Test
    public void checkOldestFound() {
        Dog[] dogs = {
                new Dog("Miki", Breed.TERRIER, 4),
                new Dog("John", Breed.HOUND, 7),
                new Dog("Bob", Breed.BASENJI, 8),
                new Dog("Tuzik", Breed.AKITA, 1),
                new Dog("Bred", Breed.BULLDOG, 5) };
        Dog actual;
        Dog expected;
        //
        expected = new Dog("Bob", Breed.BASENJI, 8);
        actual = Dog.getOldest(dogs);
        Assert.assertEquals(expected, actual);
    }
}
