package com.softserve.edu.homework6;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print("Enter the number of month from 1 to 12 - ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		boolean introduction = false;
		if (month > 12 || month < 1) {
			System.out.println("Ups, something went wrong");
		} else {
			System.out.println(month + " month have " + monthDays[month - 1] + " days");
			introduction = true;
		}
		if (!introduction) {
			System.out.print("The number is incorrect");
		}
		scan.close();
	}
}