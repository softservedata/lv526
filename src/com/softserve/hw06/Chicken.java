package com.softserve.hw06;

public class Chicken extends NonFlyingBird {

    public Chicken() {
        super(true);
    }

    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }

}