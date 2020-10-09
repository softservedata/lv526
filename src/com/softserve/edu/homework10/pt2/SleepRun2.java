package com.softserve.edu.homework10.pt2;

public class SleepRun2 implements Runnable {
@Override
	public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()
                   + " - " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
