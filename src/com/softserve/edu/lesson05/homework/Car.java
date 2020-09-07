package com.softserve.edu.lesson05.homework;

import java.util.Scanner;

enum Type {
	HATCHBACK("Hatchback"), SEDAN("Sedan"), SUV("Sport utility vehicle"), COUPE("Coupe"), CONVERTIBLE("Convertible"),
	WAGON("Wagon"), VAN("VAN"), JEEP("Jeep"), DEF("Default");

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
	private int horsePower;

	private static Scanner scanner;

	static {
		scanner = null;
	}

	private Car() {
		type = "";
		year = 0;
		horsePower = 0;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", horsePower=" + horsePower + "]";
	}

	private Car(String type, int year, int horsePower) {
		this.type = type;
		this.year = year;
		this.horsePower = horsePower;
	}

	public static Car readFromKeyboard() {
		String type = "";
		int year = 0;
		int hoursePower = 0;

		if (scanner == null) {
			scanner = new Scanner(System.in);
		}

		try {
			System.out.print("Enter car body type - ");
			type = scanner.nextLine().toUpperCase();
			type = Type.valueOf(type).getType();
		} catch (Exception e) {
			System.out.println("Error, incorrect body style");
			type = Type.valueOf("DEF").getType();
		}
		System.out.print("Enter year - ");
		year = scanner.nextInt();
		System.out.print("Enter horse power - ");
		hoursePower = scanner.nextInt();
		scanner = null;
		return new Car(type, year, hoursePower);
	}

	public void closeScanner() {
		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
	}

	public void swap(Car[] car, int i, int max) {
		String tmpType;
		int tmpYear;
		int tmpHorsePoser;
		tmpType = car[i].getType();
		tmpYear = car[i].getYear();
		tmpHorsePoser = car[i].getHorsePower();

		car[i].setType(car[max].getType());
		car[i].setYear(car[max].getYear());
		car[i].setHorsePower(car[max].getHorsePower());

		car[max].setType(tmpType);
		car[max].setYear(tmpYear);
		car[max].setHorsePower(tmpHorsePoser);
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

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

}
