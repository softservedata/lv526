package chapter6_OOP.animal;

import chapter6_OOP.animal.Animal;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.print(" Gav");
    }

    @Override
    public void feed() {
        System.out.print(" Eat ");
    }
}
