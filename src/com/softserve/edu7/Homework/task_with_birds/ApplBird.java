package com.softserve.edu7.Homework.task_with_birds;

public class ApplBird {
    public static void main(String[] args) {
        Bird[] birds = new Bird[7];
        birds[0] = new Eagle("Grey",20);
        birds[1] = new Swallow("Yellow",20);
        birds[2] = new Penguin("Red",20);
        birds[3] = new Eagle("Blue",20);
        birds[4] = new Kiwi("Green",20);
        birds[5] = new Kiwi("Green with Red",20);
        birds[6] = new Eagle("Grey",20);

        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i].toString());
            birds[i].fly();
        }


    }


}
