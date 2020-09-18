package com.softserve.edu05;

import java.util.Scanner;

public class RangeApp {

	public static boolean check(float f) {
		boolean isInRange = false;
			if (f >= -5.0 && f <= 5.0) {
				isInRange = true;
				System.out.println("Number " + f + " is in range [-5,5]");
			} else {
				System.out.println("Number " + f + " isn't in range [-5,5]");
			}	
			return isInRange;
		}	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (float i= 0; i<3; i++) {
			System.out.println("Enter float number");
			float fl = scan.nextFloat();
			check(fl);
		}
		
		scan.close();
	}

}
