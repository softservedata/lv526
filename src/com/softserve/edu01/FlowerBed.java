package com.softserve.edu01;

import java.util.Scanner;

public class FlowerBed {
	public static void main(String[] args) {
		
		System.out.print("Input int radius = ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double p = 3.14;
		double area = p * radius * radius;
		double perimeter = 2 * radius * p;
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);

	}
}
