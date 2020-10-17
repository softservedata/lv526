package com.softserve.edu.task5.Birds;

public class BirdsProgram {
    public static void main(String[] args) {
        Bird[] birds= {
          new Eagle(),
          new Swallow(),
          new Penguin(),
          new Chicken()
        };

        for (Bird bird : birds){
            bird.fly();
            System.out.println(bird);
            System.out.println("----------");

        }
    }
}
