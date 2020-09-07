package com.softserve.edu.lesson05.homework;

import java.util.Scanner;

public class ApplCar {
	public static void main(String[] args) {
		Car[] car = new Car[4];
		System.out.println("Input data about 1 car");
		for (int i = 0; i < car.length; i++) {
			car[i] = Car.readFromKeyboard();
		}

		System.out.println("Enter the year to see the list of cars - ");
		Scanner scanner = new Scanner(System.in);
		int year;
		year = scanner.nextInt();

		for (int l = 0; l < car.length; l++) {
			for (int i = 1; i < car.length; i++) {
				if (car[i].getYear() > car[i - 1].getYear()) {
					car[i].swap(car, i, (i - 1));
				}
			}
		}

		for (int i = 0; i < car.length; i++) {
			if (year == car[i].getYear()) {
				System.out.println(car[i].toString());
			}
		}

		System.out.println("\n");
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].toString());
		}
		scanner.close();
		car[0].closeScanner();
	}
}
