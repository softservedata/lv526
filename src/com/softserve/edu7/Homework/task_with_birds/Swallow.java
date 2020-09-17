package com.softserve.edu7.Homework.task_with_birds;

public class Swallow extends FlyingBird {


    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
