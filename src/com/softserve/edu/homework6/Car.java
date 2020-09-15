package com.softserve.edu.homework6;
import java.util.Scanner;
enum Type {
	CABRIOLET("Cabriolet"), LIMOUSINE("Limousine"), CROSSOVER("Crossover"), MINIVAN("Minivan");

	private String type;
	private Type(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}

public class Car {
	private String type;
	private int year;
	private int capacity;
	private static Scanner scanner;

	static {scanner = null;
	}

	private Car() {
		type = "";
		year = 0;
		capacity = 0;
	}

	private Car(String type, int year, int capacity) {

		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}

	public static Car input() {
		String type = "";
		int year = 0;
		int capacity = 0;

		if (scanner == null) {
			scanner = new Scanner(System.in);
		}

		try {
			System.out.print("Enter type - ");
			type = scanner.nextLine().toUpperCase();
			type = Type.valueOf(type).getType();
		} catch (Exception e) {
			System.out.println("Error, incorrect input! Try again");
		}
		
		System.out.print("Enter year - ");
		year = scanner.nextInt();
		System.out.print("Enter Capacity (sm3) - ");
		capacity = scanner.nextInt();
		scanner = null;
		return new Car(type, year, capacity);
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

	public int getCapacity() {
		return (int) capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void change(Car[] car, int i, int max) {
		String tmpType;
		int tmpYear;
		int tmpCapacity;
		tmpType = car[i].getType();
		tmpYear = car[i].getYear();
		tmpCapacity = car[i].getCapacity();

		car[i].setType(car[max].getType());
		car[i].setYear(car[max].getYear());
		car[i].setCapacity(car[max].getCapacity());

		car[max].setType(tmpType);
		car[max].setYear(tmpYear);
		car[max].setCapacity(tmpCapacity);
	}

	@Override
	public String toString() {
		return "Car [Type - " + type 
				+ ", Year of production - " 
				+ year + ", Capacity (sm3) - " 
				+ capacity + "]";
	}

	public void closeScanner() {
		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
	}
}
