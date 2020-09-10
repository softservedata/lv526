package com.softserve.edu.task3.Dog;

public enum Breed {
    AKITA,
    BULLDOG,
    TERRIER,
    HOUND,
    BASIN;
}


class Dog {
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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static boolean getDuplicateName(Dog[] dogs) {
        boolean result = false;
        for (int i = 0; (i < dogs.length - 1) && !result; i++) {
            for (int j = i + 1; (j < dogs.length) && !result; j++) {
                if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                    result = true;
                    System.out.println("Dogs with the same name:\n" + dogs[i] + "\n" + dogs[j]);
                }
            }
        }
return result;
    }

    public static Dog getOldest(Dog[] dogs) {
        Dog max = dogs[0];
        for (Dog currentDog : dogs) {
            if (currentDog.getAge() > max.getAge()) {
                max = currentDog;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Miki", Breed.TERRIER, 4),
                new Dog("John", Breed.HOUND, 7),
                new Dog("Bob", Breed.BASIN, 3),
                new Dog("John", Breed.AKITA, 1),
                new Dog("Bred", Breed.BULLDOG, 5),
        };

        System.out.println("Duplicate is: " + Dog.getDuplicateName(dogs));
        System.out.println("Oldest dog: " + Dog.getOldest(dogs));
    }
}

