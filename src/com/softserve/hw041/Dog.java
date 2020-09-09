package com.softserve.hw041;

enum Breed {
    AKITA, BULLDOG, TERRIER, HOUND, BASENJI;
}

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("\tDog.equals running");
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Dog other = (Dog) obj;
        if ( (age != other.age) 
                || ((breed == null) && (other.breed != null))
                || ((breed != null) && (other.breed == null))
                || (breed != other.breed)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null)) ) {
            return false;
        }
        return ((name == null) && (other.name == null))
                || name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Dog [name = " + name + ", breed = " + breed.name().toLowerCase() + ", age = " + age + "]";
    }

    public static boolean isDuplicateNames(Dog[] dogs) {
        boolean result = false;
        for (int i = 0; i < (dogs.length - 1) && !result; i++) {
            for (int j = i + 1; (j < dogs.length) && !result; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    result = true;
                    System.out.println("Duplicate name:\n" + dogs[i] + " \n" + dogs[j]);
                }
            }
        }
        return result;
    }
    
    public static Dog getOldest(Dog[] dogs) {
        Dog result = dogs[0];
        for (Dog currentDog : dogs) {
            if (currentDog.getAge() > result.getAge()) {
                result = currentDog;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Miki", Breed.TERRIER, 4),
                new Dog("John", Breed.HOUND, 7),
                new Dog("Bob", Breed.BASENJI, 8),
                new Dog("John", Breed.AKITA, 1),
                new Dog("Bred", Breed.BULLDOG, 5) };
        System.out.println("isDuplicateNames: " + Dog.isDuplicateNames(dogs));
        System.out.println("Oldest Dog: " + Dog.getOldest(dogs));
    }

}
