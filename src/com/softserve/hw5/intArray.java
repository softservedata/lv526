package com.softserve.hw5;

import java.util.Scanner;

public class intArray {
	private int [] arr = new int[3];
	int max=arr[0];
	int min=arr[0];
	public void MaxMin() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)max=arr[i];
			else if(min>arr[i])min=arr[i];		}
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);
			
	}
	public void input() {
		for(int i=0;i< arr.length;i++) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter float numbers");
		       arr[i] = scanner.nextInt();
			}
	}
}
