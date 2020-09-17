package com.softserve.edu7.Practical.task_with_interface;

import com.softserve.edu7.Practical.task_with_interface.Animal;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Gav gav gav");
    }

    @Override
    public void feed() {
        System.out.println("Will eat meat");
    }
}
