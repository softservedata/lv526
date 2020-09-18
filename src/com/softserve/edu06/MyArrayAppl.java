package com.softserve.edu06;

import java.util.Arrays;

public class MyArrayAppl {

	public static void main(String[] args) {
	
		MyArray arr = new MyArray();
		
		System.out.println(arr.getNum());
		
		System.out.println("The biggest number is: " + arr.max());
		System.out.println("Sum of positive numbers is: " + arr.sumPositive());
		System.out.println("Amount of negative numbers is: " + arr.amountNegative());
		
		if (arr.amountNegative()>arr.amountPositive()) {
			System.out.println("Quantity of negative numbers are bigger");
		}else {
			System.out.println("Quantity of positive numbers are bigger");
		}
		
	}

}
