package com.softserve.edu06;

import java.util.Scanner;

public class Car {
	
	private String type;
	private int year;
	private int engineCapacity;
	
	public Car() {}
	
	public Car(String type, int year, int engineCapacity) {
		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engineCapacity=" + engineCapacity + "]";
	}

	public static void carYear (Car[] car) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year of production: ");
		
		int input = scan.nextInt();
		int count = 0;
		for (Car i: car) {
			if (input == i.getYear()) {
				System.out.println(i.toString());
				count++;
			}
		}
		
		if (count == 0) {
		System.out.println("Car is not found");
		}
		scan.close();
	}
	
	public static void carOrderedByYear (Car[] car) {
		int temp;
		for (int i = 0; i<car.length-1; i++) {
			for (int j = 0; j<car.length-1 - i; j++) {
				if (car[j].getYear()>car[j+1].getYear()) {
					temp = car[j].getYear();
					car[j].setYear(car[j+1].getYear());
					car[j+1].setYear(temp);
				}
			}
		}
		
		for (Car i:car) {
			System.out.println("Cars ordered by year of production:");
			System.out.println(i);
		}
	}
}
