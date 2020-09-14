package com.softserve.edu.task5.Animal;

public class Program {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat(),
                new Cat(),
                new Dog(),
                new Dog()
        };

        for(int i = 0; i < animals.length; i++){
            animals[i].voice();
            animals[i].feed();
        }
        System.out.println(animals);
    }
}
