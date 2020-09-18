package com.softserve.edu05;

import java.util.Scanner;

public class MinMax {

	private int num1;
	private int num2;
	private int num3;
	
	public MinMax() {
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer number1  = ");
		
		num1 = scan.nextInt();
		System.out.print("Enter integer number2  = ");
		num2 = scan.nextInt();
		System.out.print("Enter integer number3  = ");
		num3 = scan.nextInt();
	
	}
	
	public void min() {
		if (num1<num2 && num1<num3) {
			System.out.println("Min number is " + num1);
		} else if (num2<num1 && num2<num3) {
			System.out.println("Min number is " + num2);
		} else {
			System.out.println("Min number is " + num3);
		}
	}
	
	public void max() {
		if (num1>num2 && num1>num3) {
			System.out.println("Max number is " + num1);
		} else if (num2>num1 && num2>num3) {
			System.out.println("Max number is " + num2);
		} else {
			System.out.println("Max number is " + num3);
		}
	}
	
}
