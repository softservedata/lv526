package com.softserve.edu.lesson05.homework;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("input 5 numbers, if you enter a negative number entering will stop");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < 0) {
				break;
			}
		}
		scanner.close();

		int min;
		int count;
		int minCount;
		int maxCount;
		int prod;
		maxCount = 0;
		minCount = 0;
		prod = 1;
		count = 0;

		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
				if (count == 2) {
					maxCount = i;
				}
			}
			if (arr[i] < min) {
				minCount = i;
				min = arr[i];
			}
			if ((arr[i] % 2) == 0) {
				prod *= arr[i];
			}
		}

		System.out.println("position of second positive number - " + (maxCount + 1));
		System.out.println("Minimum number - " + min + ", and it's possition - " + (minCount + 1));
		System.out.println("product of all entered even numbers - " + prod);
	}
}
