package com.softserve.edu.homework10.hw1;

public class Hw1 {

	public static void main(String[] args) {

		SleepRunnable sleepRunnable = new SleepRunnable();

		Thread one = new Thread(sleepRunnable);
		one.setName("I am first");
		Thread two = new Thread(sleepRunnable);
		two.setName("He is second");
		Thread three = new Thread(sleepRunnable);
		three.setName("She is third");

		one.start();
		try {
			one.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		two.start();
		try {
			two.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		three.start();
		try {
			three.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}