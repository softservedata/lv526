package com.softserve.edu.task5.Birds;

public class NonFlyingBird extends Bird {
    protected boolean flyind;

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.flyind = false;
    }

    public void fly() {

    }
}
