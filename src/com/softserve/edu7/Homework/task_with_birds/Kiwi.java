package com.softserve.edu7.Homework.task_with_birds;

public class Kiwi extends NonFlyingBird {


    public Kiwi(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
