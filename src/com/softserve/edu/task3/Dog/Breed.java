package com.softserve.edu.task3.Dog;

public enum Breed {
    AKITA,
    BULLDOG,
    TERRIER,
    HOUND,
    BASENJI;
}


class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
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
        return "Dog {" +
                "name ='" + name + '\'' +
                ", breed ='" + breed + '\'' +
                ", age = " + age +
                '}';
    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Miki", "TERRIER", 4),
                new Dog("John", "HOUND", 7),
                new Dog("Bob", "BASENJI", 3),
                new Dog("John", "AKITA", 1),
                new Dog("Bred", "BULLDOG", 5),
        };

        boolean huh = false;
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (j != i && dogs[j].getName() == dogs[i].getName()) {
                    huh = true;
                    System.out.println("Dogs with the same nam: " + huh + " - " + dogs[j].toString());
                }
            }
        }
        //System.out.println(huh);

        Dog max = dogs[0];

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > max.getAge()) {
                max = dogs[i];
            }
        }
        System.out.println("Oldest dog: " + max.toString());
    }
}

