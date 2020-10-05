package com.softserve.edu.homework10.pt1;

public class Pt1 {

	public static void main(String[] args) {
		
		SleepRun sleepRunnable = new SleepRun();

        Thread one = new Thread(sleepRunnable);
        one.setName("I study Java");
        
        one.start();
        
    }
}
