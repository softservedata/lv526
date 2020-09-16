package chapter6_OOP.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();

        Animal[] animalArray = {cat1, dog1, cat2, dog2, dog3};

        for (Animal animal : animalArray) {
            animal.feed();
            animal.voice();
            System.out.println("\n -------");
        }

    }
}
