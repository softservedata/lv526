package com.softserve.edu06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	int[] arr = new int[5];
	
	for (int i = 0; i<arr.length; i++) {
		System.out.println("Enter integer number");
		arr[i] = scan.nextInt();
	}
	
	boolean isContinue = true;
	int count = 0;
	int indexPos = 0;
	for(int i = 0; i<arr.length && isContinue; i++) {
		if (arr[i]>0) {
			count++;
			if (count==2) {
				indexPos = i +1;
				System.out.println("Position of second positive number is " + indexPos);
				isContinue = false;
			} 
		}
		
	}
	
	if (count ==0) {
		System.out.println("There are no positive numbers");
	}
	
	int index = 0;
	int min = arr[index];
	for (int i = 1; i<arr.length; i++) {
		if (arr[i]<min) {
			min = arr[i];
			index = i;
		}
	}
	System.out.println("Min is " + min + ". It's position is " + (index+1) + "."); 
	
	
	/*int[] arr1 = {};

	
	boolean isContinue1 = true;
	for (int i = 0; isContinue1; i++) {
	System.out.println("Enter iteger number");
	int temp = Integer.parseInt(scan.nextLine());
		if (temp>0) {
		
			arr1[0] = temp;
		} else {
			isContinue1 = false;
		}
	}*/

	
	}
		
	
	
}
