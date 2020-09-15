package com.softserve.hw6;

import java.util.Scanner;

public class Car {
	
	private int year;
	private int engine_capacity;
	public Car() {
		year = 1900;
		engine_capacity = 100;
	}
	public Car(int year) {
		this.year = year;
		engine_capacity = 100;
	}
	public Car(int year, int engine_capacity) {
		this.year = year;
		this.engine_capacity = engine_capacity;
	
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int year");
       int y = scanner.nextInt();
       year=y;
       Scanner scanner1 = new Scanner(System.in);
       System.out.print("Enter engine capacity");
      int e = scanner.nextInt();
       engine_capacity=e;
       
	}
	
	public void output() {
		System.out.print("year = " + year);
		 System.out.print("engine capacity = " + engine_capacity);
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
}
