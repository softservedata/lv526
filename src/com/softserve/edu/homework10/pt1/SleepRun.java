package com.softserve.edu.homework10.pt1;

public class SleepRun implements Runnable {

	public void run() {
        for (int x = 1; x < 11; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
