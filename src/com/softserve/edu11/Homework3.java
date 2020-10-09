package com.softserve.edu11;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}
	
}

class MyThread2 implements Runnable{
	public void run() {
		for (int i = 0; i<3; i++) {
			System.out.println("Thread number two");
		}
		
		Thread t3 = new Thread(new MyThread3());
		t3.start();
	}
}

class MyThread3 implements Runnable{
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("Thread number three");
		}
	}
}

public class Homework3 {

	public static void main(String[] args){
		Thread t1 = new Thread(new MyThread1());
		t1.start();
		
	}

}
