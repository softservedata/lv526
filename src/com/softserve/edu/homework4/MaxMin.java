package com.softserve.edu.homework4;

import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
	        
			System.out.println("Entrer 3 integer numbers: ");
					
			int[] n = new int[3];
			int[] x = new int[3];
			int max;
			int min;
			
			for (int i = 0; i < x.length; i++) {
				
				x[i] = scan.nextInt();
				scan.nextLine();
			}
			
			max = x[0];
			min = x[0];
			
			for (int i = 1; i < n.length; i++) {
				if ((x[i] > max)) {
				   max = x[i];
				}
				if ((x[i] < min)) {
				   min = x[i];
				}

			}
			System.out.print("Max value:  " + max +";   " +"Min value: "+min+";");
			scan.close();
      }
	}
