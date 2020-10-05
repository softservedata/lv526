package com.softserve.edu.homework10.hw1;

public class SleepRunnable implements Runnable {
    
	public void run() {
        for (int r = 1; r < 6; r++) {
            System.out.println(Thread.currentThread().getName()+ ", run - " + r);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}