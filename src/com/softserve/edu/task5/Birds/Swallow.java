package com.softserve.edu.task5.Birds;

public class Swallow extends FlyingBird{

    public Swallow() {
        super(true, true);
    }

    public void fly(){
        System.out.println("Swallow: feathers " + this.feathers + " Lay eggs " + this.layEggs + " FlyingBird " + this.flyind);
    }
}
