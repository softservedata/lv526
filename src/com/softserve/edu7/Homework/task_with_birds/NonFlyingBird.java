package com.softserve.edu7.Homework.task_with_birds;

public class NonFlyingBird extends  Bird {

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Walking");
    }
}
