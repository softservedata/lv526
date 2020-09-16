package com.softserve.edu.task5.Birds;

public class Chicken extends NonFlyingBird{

    public Chicken() {
        super(true,true);
    }

    public void fly(){
        System.out.println("Chicken: feathers " + this.feathers + " Lay eggs " + this.layEggs + " FlyingBird " + this.flyind);
    }
}
