package com.softserve.edu10.practical.unique_task;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = new Plant[4];
        plants[0] = new Plant(30,Color.YELLOW,Type.CACTUS);
        System.out.println(plants[0]);
        plants[1] = new Plant(40,"pINK","cactus");
        System.out.println(plants[1]);
    }
}
