package com.softserve.edu.task5.Birds;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
