package chapter4;

import org.junit.Assert;

public class DogTest {

    @org.junit.jupiter.api.Test
    void isDuplicateNameTrue() {
        Dog[] dogs = {
                new Dog("Mik ", Breed.AKITA, 4),
                new Dog("Bob ", Breed.BASENJI, 5),
                new Dog("Liki ", Breed.BULDOG, 6),
                new Dog("Mik ", Breed.HOUND, 7),};

        boolean actual;
        actual = Dog.isDuplicateName(dogs);
        Assert.assertTrue(actual);
    }
    @org.junit.jupiter.api.Test
    void isDuplicateNameNotFound() {
        Dog[] dogs = {
                new Dog("Miki ", Breed.AKITA, 4),
                new Dog("Bob ", Breed.BASENJI, 5),
                new Dog("Liki ", Breed.BULDOG, 6),
                new Dog("Mik ", Breed.HOUND, 7),};

        boolean actual;
        actual = Dog.isDuplicateName(dogs);
        Assert.assertFalse(actual);
    }


    @org.junit.jupiter.api.Test
    void finderOldestDog() {
        Dog[] dogs = {
                new Dog("Miki ", Breed.AKITA, 4),
                new Dog("Bob ", Breed.BASENJI, 10),
                new Dog("Liki ", Breed.BULDOG, 6),
                new Dog("Mik ", Breed.HOUND, 7),};

        Dog actual;
        Dog expected;
        expected = new Dog("Bob " , Breed.BASENJI , 10);
        actual = Dog.finderOldestDog(dogs);
        Assert.assertEquals(expected , actual);



    }
}
