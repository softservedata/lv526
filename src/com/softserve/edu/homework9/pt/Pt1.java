package com.softserve.edu.homework9.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pt1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculateArea calcA = new CalculateArea();

		try {
			System.out.print("Enter length - a = ");
			int a = scan.nextInt();
			System.out.print("Enter width - b = ");
			int b = scan.nextInt();
			System.out.println("Area of the rectangle = " + calcA.squareRectangle(a, b) + ";");
		} catch (InputMismatchException e) {
			System.out.print("InputMismatchException: ");
			System.out.println("Message: " + e.getMessage());
		} catch (CalculateException e) {
			System.out.print("CalculateException: ");
			System.out.println("Message: " + e.getMessage());
		} finally {
			scan.close();
		}
	}
}