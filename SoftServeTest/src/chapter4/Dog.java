package chapter4;

import java.util.Objects;
import java.util.Scanner;

enum Breed {
    AKITA,
    BULDOG,
    TERRIER,
    HOUND,
    BASENJI;
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
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed.name().toLowerCase() + '\'' +
                ", age=" + age +
                '}';
    }

    public static boolean isDuplicateName(Dog[] dogs) {
        boolean result = false;
        for (int i = 0; (i < dogs.length - 1) && !result; i++) {
            for (int j = i + 1; (j < dogs.length) && !result; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    result = true;
                    System.out.println("Duplicate name :\n " + dogs[i] + "\n" + dogs[j]);
                }
            }
        }
        return result;
    }

    public static Dog finderOldestDog(Dog[] dogs) {
        Dog result = dogs[0];
        for (Dog currentDog : dogs) {
            if (currentDog.getAge() > result.getAge()) {
                result = currentDog;
            }
        }
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Mik ", Breed.AKITA, 4),
                new Dog("Bob ", Breed.BASENJI, 5),
                new Dog("Liki ", Breed.BULDOG, 6),
                new Dog("Mik ", Breed.HOUND, 7),
        };
        System.out.println(isDuplicateName(dogs));
        System.out.println(finderOldestDog(dogs));

    }
}
