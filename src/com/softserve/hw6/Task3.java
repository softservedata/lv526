package com.softserve.hw6;

import java.util.Scanner;

public class Task3 {
	private int [] arr = new int[5];
	private int min=arr[0];
	public void input() {
		for(int i=0;i< arr.length;i++) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter int numbers");
		       arr[i] = scanner.nextInt();
			}
	}
	public void Pos2() {
		int k=0;
		int in=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]>=0) {
				k++;
			}
			if(k==2) {
				in=i;
			}
		} System.out.println("index = " + in);
	}
	public void Min() {
		int in=0;
		for(int i=0;i< arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
			in=i;
			}
		}System.out.println("min = " + min);
		System.out.println("index = " + in);
	}
	public void first() {
		int k;
		int z=1;
		do {
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter int numbers");
	        k = scanner.nextInt();
	        if(k % 2 == 0) {
	        	z*=k;
	        }
			
		}while(k > 0);
		System.out.print(z);
			
	}
}
