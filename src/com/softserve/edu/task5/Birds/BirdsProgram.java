package com.softserve.edu.task5.Birds;

public class BirdsProgram {
    public static void main(String[] args) {
        Bird[] birds= {
          new Eagle(),
          new Swallow(),
          new Penguin(),
          new Chicken()
        };

        for(int i = 0; i < birds.length; i++){
            birds[i].fly();
        }
    }
}
