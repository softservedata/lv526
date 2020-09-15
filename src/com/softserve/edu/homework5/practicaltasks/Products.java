package com.softserve.edu.homework5.practicaltasks;


public class Products {

	public static void main(String[] args) {
		Product p1 = new Product("Paper", 90,2);
		Product p2 = new Product("Pen", 25,4);
		Product p3 = new Product("Pencil", 12,3);
		Product p4 = new Product("Scissors", 40,1);
		
		Product mostExpensive = Product.mostExpensive(p1,p2,p3,p4);
		Product biggestQantity = Product.biggestQantity(p1,p2,p3,p4);
		
		System.out.println("Most expensive ["+ "Name - " + mostExpensive.getName() + ", Qantity = "+mostExpensive.getPrice() +"]");
		System.out.println("Biggest quantity ["+"Name - " + biggestQantity.getName()+ "]");
	}		
}
