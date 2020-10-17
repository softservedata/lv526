package com.softserve.edu.task9;

public class Appl2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(600);
                System.out.print("-");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
