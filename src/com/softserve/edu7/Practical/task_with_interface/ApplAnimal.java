package com.softserve.edu7.Practical.task_with_interface;

public class ApplAnimal {
    public static void main(String[] args) {
        /*-
        Create interface Animal witj methods voice() and feed().
        Create two classes Cat and Dog,which implement this interface.
        Create array of Animal and add some Cats and Dogs to it.
        Call voice() and feed() method for all of it.
         */
        Animal d1 = new Dog();
        Animal c1 = new Cat();
        Animal[] all_animal = {d1,c1};

        for (int i = 0; i <all_animal.length ; i++) {
            all_animal[i].voice();
            all_animal[i].feed();
        }
    }
}
