package com.softserve.edu.homework;
import java.util.Scanner;

public class Define_integer_variables {

	private static Scanner fromUser;

	public static void main(String[] args) 
	{
		fromUser = new Scanner (System.in);
		int a, b;
		
		System.out.println("Enter value à");
		a = fromUser.nextInt();
		
		System.out.println("Enter value b");
		b = fromUser.nextInt();
		
		System.out.println("Results:");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
				
	}

}