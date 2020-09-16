package chapter6_OOP.animal;

import chapter6_OOP.animal.Animal;

public class Cat implements Animal {


    @Override
    public void voice() {
        System.out.print(" Meow");

    }

    @Override
    public void feed() {
        System.out.print(" eating");

    }
}
