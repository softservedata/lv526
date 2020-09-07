package com.softserve.hw5;

import java.util.Scanner;

public class doubleArray {
	private  double[] arr = new double[3];
	public void Range() {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=(-5) && arr[i]<=5 ) {
				k++;
			}
		}
		if(k==3)System.out.println("belong to the range [-5,5]");
		else System.out.println("do not belong to range [-5.5]");
		}
	public void input() {
		for(int i=0;i< arr.length;i++) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter float numbers");
		       arr[i] = scanner.nextDouble();
			}
	}
	
	}


