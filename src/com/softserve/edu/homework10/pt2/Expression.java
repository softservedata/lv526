package com.softserve.edu.homework10.pt2;

public class Expression {
	public static void main(String args[]) {
		
		SleepRun1 slRun = new SleepRun1();
		SleepRun2 slRun2 = new SleepRun2();

		Thread one = new Thread(slRun);
		one.setName("Hello, world");

		one.start();
		try {
			one.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		Thread two = new Thread(slRun2);
		two.setName("Peace in the peace");

		two.start();
		try {
			two.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("My name is Jack");
	}
}