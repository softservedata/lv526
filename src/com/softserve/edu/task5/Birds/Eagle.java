package com.softserve.edu.task5.Birds;

public class Eagle extends FlyingBird{

    public Eagle() {
        super(true, false);
    }

    public void fly(){
        System.out.println("Eagle: feathers " + this.feathers + " Lay eggs " + this.layEggs + " FlyingBird " + this.flyind);
    }
}
