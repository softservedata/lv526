package com.softserve.edu11;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Text1());
		Thread t2 = new Thread(new Text2());
		Thread t3 = new Thread(new Text3());
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		t3.start();
		t3.join();
		
		
		System.out.println("main done");
	}

}
