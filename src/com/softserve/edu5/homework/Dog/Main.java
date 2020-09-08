package com.softserve.edu5.homework.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Akki", Breed.AKITA, 5);
        Dog dog2 = new Dog("Tuzik", Breed.TERRIER, 7);
        Dog dog3 = new Dog("Yuzik", Breed.SPANIEL, 3);
        dog1.compare(dog2, dog3);
        dog1.oldestDog(dog2, dog3);
    }
}
