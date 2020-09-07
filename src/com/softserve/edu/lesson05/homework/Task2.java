package com.softserve.edu.lesson05.homework;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int prod = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 10 numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
//		scanner.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0) {
				for (int k = 5; k < arr.length; k++) {
					prod *= arr[k];
					if (k == (arr.length - 1)) {
						System.out.println("product of last 5 elem - " + prod);
					}
				}
				break;
			} else {
				sum += arr[i];
			}
			if (i == 4) {
				System.out.println("sum first 5 elem - " + sum);
			}
		}

		scanner.close();
	}
}
