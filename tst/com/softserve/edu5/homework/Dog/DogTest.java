package com.softserve.edu5.homework.Dog;

import org.junit.Assert;

import static com.softserve.edu5.homework.Dog.Breed.AKITA;
import static com.softserve.edu5.homework.Dog.Breed.PUGABULL;
import static com.softserve.edu5.homework.Dog.Breed.SPANIEL;
import static org.junit.Assert.*;

public class DogTest extends Object {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("\t@org.junit.Before");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("\t@org.junit.After ");
    }

    @org.junit.Test
    public void compareOnNotSame() {
        Dog dog1 = new Dog("Mimo",AKITA,17);
        Dog dog2 = new Dog("Mimo",AKITA,17);
        Dog dog3 = new Dog("Mimo",AKITA,17);
        boolean actual = dog1.compareOnNotSame(dog2,dog3);
        boolean excepted = false;
        Assert.assertEquals(excepted,actual);
        System.out.println("\t\t@Test compare()");
    }

    @org.junit.Test
    public void oldestDog() {
        Dog dog1 = new Dog("Mimo",AKITA,17);
        Dog dog2 = new Dog("Zezo",PUGABULL,13);
        Dog dog3 = new Dog("Lino",SPANIEL,14);
        Object actual = dog1.oldestDog(dog2,dog3);
        Object excepted = dog1.toString();
        Assert.assertEquals(excepted,actual);
        System.out.println("\t\t@Test oldestDog()");
    }
}