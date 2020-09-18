package com.softserve.edu06;

public class Task2 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 9, 4, 5, -9, 8, -7, 2, 6};
		
		int sum = 0;
		int product =1;
		for (int i = 0; i<5; i++) {
			if (arr[i]>0) {
				sum += arr[i];
			}else {
				product = arr[0] * arr[1] * arr[2] * arr[3]  * arr[4];
			}
		}
		
		if (sum>0) {
			System.out.println(sum);
		} else {
			System.out.println(product);
		}
		
	}
}