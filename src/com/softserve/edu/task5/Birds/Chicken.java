package com.softserve.edu.task5.Birds;

public class Chicken extends NonFlyingBird{
    boolean feathers;
    boolean layEggs;

    public Chicken() {
        this.feathers = true;
        this.layEggs = true;
    }

    public boolean fly(){
        System.out.println("Chicken: feathers " + feathers + " Lay eggs " + layEggs + " FlyingBird " + false);
        return false;
    }
}
