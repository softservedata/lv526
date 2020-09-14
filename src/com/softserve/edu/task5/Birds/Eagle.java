package com.softserve.edu.task5.Birds;

public class Eagle extends FlyingBird{
    boolean feathers;
    boolean layEggs;

    public Eagle() {
        this.feathers = true;
        this.layEggs = false;
    }

    public boolean fly(){
        System.out.println("Eagle: feathers " + feathers + " Lay eggs " + layEggs + " FlyingBird " + true);
        return true;
    }
}
