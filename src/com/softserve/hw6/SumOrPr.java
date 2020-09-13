package com.softserve.hw6;

import java.util.Scanner;

public class SumOrPr {
	private int [] arr = new int[10];
	
	
	public void input() {
		for(int i=0;i< arr.length;i++) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter int numbers");
		       arr[i] = scanner.nextInt();
			}
	}
		
	public void SorP() {
		boolean k= true;
		int sum=0;
		int pr=1;
		
		
		for(int i=0;i< arr.length;i++) {
			if(i<5) {
				sum+=arr[i];
				if(arr[i]<0)k=false;
			}else pr*=arr[i];
				
		}
		if(k==true) {
			System.out.print(sum);
		}else System.out.print(pr);
	}
		


}
