package com.softserve.edu.lesson04.practicaltask;

import java.util.Scanner;

public class PracticalTask {
	
	public void threeNum() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int i=0;
		System.out.println("Enter three number : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a%2 == 0) {
			i++;
		}
		if(b%2 == 0) {
			i++;
		}
		if(c%2 ==0) {
			i++;
		}
		System.out.print( i + " numbers are odd");
	}
	
	public void week() {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter number of day");
		day = sc.nextInt();
		if(day == 1){
			System.out.print("This is monday");
		}
		if(day == 2){
			System.out.print("This is tusday");
		}
		if(day == 3){
			System.out.print("This is wednesday");
		}
		if(day == 4){
			System.out.print("This is thursday");
		}
		if(day == 5){
			System.out.print("This is friday");
		}
		if(day == 6){
			System.out.print("This is saturday");
		}
		if(day == 7){
			System.out.print("This is sunday");
		}
	
	}
}
