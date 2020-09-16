package com.softserve.hw06;

public class Penguin extends NonFlyingBird{

    public Penguin() {
        super(false);
        //super(true);
    }

    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }
    
}
