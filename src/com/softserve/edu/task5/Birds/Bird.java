package com.softserve.edu.task5.Birds;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean flyind;

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public boolean isFlyind() {
        return flyind;
    }

    public Bird(boolean feathers, boolean layEggs, boolean flyind) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.flyind = flyind;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                ", flyind=" + flyind +
                '}';
    }

    public void fly() {
        System.out.println("I can"
                + (flyind ? " " : " not ") +"fly");
    }
}
