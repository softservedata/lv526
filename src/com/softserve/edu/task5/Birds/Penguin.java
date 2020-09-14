package com.softserve.edu.task5.Birds;

public class Penguin extends NonFlyingBird{
    boolean feathers;
    boolean layEggs;

    public Penguin() {
        this.feathers = false;
        this.layEggs = true;
    }

    public boolean fly(){
        System.out.println("Penguin: feathers " + feathers + " Lay eggs " + layEggs + " FlyingBird " + false);
        return false;
    }
}
