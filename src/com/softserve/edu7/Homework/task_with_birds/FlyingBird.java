package com.softserve.edu7.Homework.task_with_birds;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Flying");
    }
}
