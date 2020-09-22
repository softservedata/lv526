package com.softserve.edu.homework4.practicaltasks;
import java.util.Scanner;
public class EvenOrOdd {
	
	public static void main(String[] args) {
			int[] number = new int[3];
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please, Enter 3 numbers: " );
		number [0] = sc.nextInt();
		number [1] = sc.nextInt();
		number [2] = sc.nextInt();
		
		for (int i = 0; i<number.length; i++) {
			String n = number[i] %2  == 0? "Even":"Odd";
			System.out.println(n);
			sc.close();
		}
	}
}
