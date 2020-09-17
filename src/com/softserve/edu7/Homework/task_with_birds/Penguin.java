package com.softserve.edu7.Homework.task_with_birds;

public class Penguin extends NonFlyingBird {


    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
