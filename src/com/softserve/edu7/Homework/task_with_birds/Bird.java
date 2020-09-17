package com.softserve.edu7.Homework.task_with_birds;

public abstract class Bird {
    String feathers;
    int layEggs;

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
