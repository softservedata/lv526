package com.softserve.edu11;

public class Homework2 {

	public static void main(String[] args) {
		
		//System.out.println("Main is started");
		Thread t = new Thread(new Runnable() {
			public void run() {
				Homework2.main(args);
			}
		});
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main is done");
		
	}

}
