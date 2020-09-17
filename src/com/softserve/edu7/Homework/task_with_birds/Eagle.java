package com.softserve.edu7.Homework.task_with_birds;

public class Eagle extends  FlyingBird {


    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
