package com.softserve.edu.homework9.hw;

import java.util.Scanner;

public class Div {
	protected double div(double a, double b) {
		double result = 0;
		try {
			if (a == 0 || b == 0)
				throw new ArithmeticException();
			else {
				result = a / b;
			}
		} catch (ArithmeticException e) {
			System.err.println(e + " \n Cannot be divided by 0!!!");
		}

		return result;
	}

	protected int readNumber(int start, int end) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		try {
			if (number > start && number < end) {
				number = number;
			} else {
				extracted();
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex + "\n This number does not belong to the declared range!");
		}
		scan.close();
		return number;

	}

	private void extracted() {
		throw new ArrayIndexOutOfBoundsException();
	}
}