package com.softserve.hw06;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private boolean flyind;

    public Bird(boolean feathers, boolean layEggs, boolean flyind) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.flyind = flyind;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public boolean isFlyind() {
        return flyind;
    }

    public void fly() {
        System.out.println("I can" 
                + (flyind ? " " : " not ") +"fly");
    }

    @Override
    public String toString() {
        return "[feathers=" + feathers
                + ", layEggs=" + layEggs
                + ", flyind=" + flyind
                + "]";
    }

}
