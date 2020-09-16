package com.softserve.edu.task5.Birds;

public class FlyingBird extends Bird{
protected boolean flyind;

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.flyind = true;
    }

    public void fly() {
    }
}
