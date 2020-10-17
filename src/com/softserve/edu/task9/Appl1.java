package com.softserve.edu.task9;

public class Appl1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(200);
                System.out.print("+");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
