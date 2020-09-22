package com.softserve.edu.homework5;

import java.util.Scanner;

public class HomeW2 {
	public static void main(String[] args) {
		int[] numbers = new int [10];
		int sum = 0;
		int product = 1;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 10 integer numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (numbers[i] < 0) {
				for (int j = 5; j < numbers.length; j++) {
					product *= numbers[j];
					if (j == (numbers.length - 1)) {
						System.out.println("Product of last 5 element = " + product);
		 			}
				}
				break;
			} else {
				sum += numbers[i];
			}
			if (i == 4) {
				System.out.println("Sum first 5 element - " + sum);
			}
		}
		scan.close();
	}
}