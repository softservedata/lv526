package com.softserve.edu11;

public class Text3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("Thread 3");
		}
		
		
	}

}
