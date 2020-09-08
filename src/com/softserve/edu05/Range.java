package com.softserve.edu05;

	import java.util.Scanner;

	public class Range {
		private float fl1;
		private float fl2;
		private float fl3;

		public Range() {
			fl1 = 0;
			fl2 = 0;
			fl3 = 0;
			
		}

		public void input() {
			System.out.print("Enter float number1  = ");
			Scanner scan = new Scanner(System.in);
			fl1 = scan.nextFloat();
			System.out.print("Enter float number2  = ");
			fl2 = scan.nextFloat();
			System.out.print("Enter float number3  = ");
			fl3 = scan.nextFloat();
			
		}

		public void check() {

			if ((fl1 >= -5.0 && fl1 <= 5.0)
			&& (fl2 >= -5.0 && fl2 <= 5.0)
			&& (fl3 >= -5.0 && fl3 <= 5.0)){
				System.out.println("All numbers are in range [-5,5]");
			} else {
				System.out.println("Not all numbers are in range [-5,5]");
			}
		}
	}
