package com.softserve.edu.lesson05.practicaltask;

import java.util.Scanner;

public class IntArr {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int max;
		int positiveSum;
		int countNegative;
		countNegative = 0;
		positiveSum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 10 integer numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] >= 0) {
				positiveSum += arr[i];
			} else
				countNegative++;
		}

		System.out.println("Max number - " + max);
		System.out.println("Sum of positive number - " + positiveSum);
		if ((arr.length / 2) > countNegative) {
			System.out.println("More possitive");
		}
		if ((arr.length / 2) < countNegative) {
			System.out.println("More negatine");
		} else
			System.out.println("The same");

	}
}
