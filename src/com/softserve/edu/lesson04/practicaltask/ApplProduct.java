package com.softserve.edu.lesson04.practicaltask;

import java.util.Scanner;

public class ApplProduct {
	public static void main(String[] args) {
	Product[] p = new Product[3];

	//input
	for(int i=0;i<p.length;i++) {
		p[i] = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name, price and quantity of " + (i+1) + " product");
		p[i].setName(sc.nextLine().toString());
		System.out.println(p[i].getName());
		p[i].setPrice(sc.nextDouble());
		System.out.println(p[i].getPrice());
		p[i].setQuantity(sc.nextInt());
		System.out.println(p[i].getQuantity());
	}
	//most expensive
	double cost=0;
	int n=0;
	for(int i=0;i<p.length;i++) {
		if(p[i].getPrice()>cost) {
			cost=p[i].getPrice();
			n=i;
		}
		if(i==(p.length-1)) {
			System.out.println("Most expensive : " + p[n].getName() + " quantity " + p[n].getQuantity());
		}
	}
	//biggest quantity
	
	int quan=0;
	int k=0;
	for(int i=0;i<p.length;i++) {
		if(p[i].getQuantity()>quan) {
			quan=p[i].getQuantity();
			k=i;
			}
		if(i==(p.length-1)) {
			System.out.println("Biggest quantity :" + p[k].getName());
		}
	}
}
}
