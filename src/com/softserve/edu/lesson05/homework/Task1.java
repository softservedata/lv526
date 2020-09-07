package com.softserve.edu.lesson05.homework;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int month;
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of the month");
		month = scanner.nextInt();
		scanner.close();

		if (month > 12 || month < 1) {
			System.out.println("Ups, something went wrong");
		} else {
			System.out.println(month + " month have " + arr[month - 1] + " days");
		}

	}

}
