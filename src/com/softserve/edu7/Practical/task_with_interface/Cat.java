package com.softserve.edu7.Practical.task_with_interface;

import com.softserve.edu7.Practical.task_with_interface.Animal;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Myau Myau Myau");
    }

    @Override
    public void feed() {
        System.out.println("Will eat fish ");
    }
}
