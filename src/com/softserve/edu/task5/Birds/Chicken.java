package com.softserve.edu.task5.Birds;

public class Chicken extends NonFlyingBird{
    public Chicken() {
        super(true);
    }

    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }

}
