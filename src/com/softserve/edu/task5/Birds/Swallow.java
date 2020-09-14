package com.softserve.edu.task5.Birds;

public class Swallow extends FlyingBird{
    boolean feathers;
    boolean layEggs;

    public Swallow() {
        this.feathers = true;
        this.layEggs = true;
    }

    public boolean fly(){
        System.out.println("Swallow: feathers " + feathers + " Lay eggs " + layEggs + " FlyingBird " + true);
        return true;
    }
}
