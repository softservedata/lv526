package com.softserve.edu.lesson01.flower;

import java.util.Scanner;

public class Flower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		double radius = sc.nextDouble();
		double area;
		double perimeter;
		area = Math.PI * Math.pow(radius,2);
		perimeter = 2 * Math.PI * radius;
		System.out.println("Radius = " + radius);
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
	}
}
