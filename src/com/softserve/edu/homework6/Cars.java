package com.softserve.edu.homework6;
import java.util.Scanner;
public class Cars {

	public static void main(String[] args) {
		Car[] car = new Car[4];
		System.out.println("Enter info about the car");
		for (int i = 0; i < car.length; i++) {
			car[i] = Car.input();
		}

			System.out.println("Enter the year to see a list of all cars : ");
			Scanner scanner = new Scanner(System.in);
			int year;
			year = scanner.nextInt();

			for (int list = 0; list < car.length; list++) {
				for (int i = 1; i < car.length; i++) {
					if (car[i].getYear() > car[i - 1].getYear()) {
						car[i].change(car, i, (i - 1));
					}
				}
			}

			for (int j = 0; j < car.length; j++) {
				if (year == car[j].getYear()) {
					System.out.println(car[j].toString());
				}
			}

			System.out.println("\n");
			for (int j = 0; j < car.length; j++) {
				System.out.println(car[j].toString());
			}
			
		
		scanner.close();
		car[0].closeScanner();
	}
}
