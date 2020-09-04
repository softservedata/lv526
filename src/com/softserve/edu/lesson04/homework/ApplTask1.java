package com.softserve.edu.lesson04.homework;

import java.util.Scanner;

public class ApplTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[3];

		System.out.print("Entre 3 double numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		for (int i = 0; i < a.length; i++) {
			if ((a[i] <= 5) && (a[i] >= -5)) {
			} else {
				System.out.println("Number " + a[i] + " bigger 5 or less -5");
			}
		}

		System.out.println("Entre 3 int numbers");
		int[] d = new int[3];
		int max;
		int min;
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		max = d[0];
		min = d[0];
		for (int i = 1; i < a.length; i++) {
			if ((d[i] > max)) {
				max = d[i];
			}
			if ((d[i] < min)) {
				min = d[i];
			}

		}
		System.out.println("Biggest number = " + max);
		System.out.println("Less number = " + min);

		int num;
		System.out.print("Number of HTTP Error = ");
		num = sc.nextInt();
	}
}
