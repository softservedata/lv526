package com.softserve.edu.homework;

import java.util.Scanner;

public class Perimeter_radius {

	 static Scanner sc = new Scanner(System.in);
	   
	 public static void main(String args[]){
		 
	      System.out.print("Enter the radius of the flower bed: ");
	      double radius = sc.nextDouble();
	      double area = Math.PI * (radius * radius);
	      System.out.println("The area of the flower bed is equal to: " + area);
	      double circumference= Math.PI * 2*radius;
	      System.out.println("The perimeter of the flower bed is equal to: " + circumference) ;
	   }
}