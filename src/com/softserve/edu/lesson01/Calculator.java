package com.softserve.edu.lesson01;


import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a;
		a = sc.nextDouble();
		System.out.print("b = ");
		double b;
		b = sc.nextDouble();
		double sum = a+b;
		double diff = a-b;
		System.out.println("a * b = " + a*b);
		System.out.println("a / b = " + a/b);
		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + diff);

	}
}
