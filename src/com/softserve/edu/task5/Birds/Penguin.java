package com.softserve.edu.task5.Birds;

public class Penguin extends NonFlyingBird{

    public Penguin() {
        super(false);

    }

    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }

}
