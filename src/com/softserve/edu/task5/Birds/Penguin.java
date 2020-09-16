package com.softserve.edu.task5.Birds;

public class Penguin extends NonFlyingBird{

    public Penguin() {
        super(false, true);
    }

    public void fly(){
        System.out.println("Penguin: feathers " + this.feathers + " Lay eggs " + this.layEggs + " FlyingBird " + this.flyind);
    }
}
