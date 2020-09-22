package com.softserve.edu.homework4.practicaltasks;

public class Product {
private String name;
private double price;
private double quantity;


public Product() {
}
public Product(String name, double price, double quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
public static Product biggestQantity(Product...products) {
	Product result = products[0];
	for (Product currentProduct : products) {
		if (currentProduct.getQuantity()>result.getQuantity()) {
			result = currentProduct;
		}
	}
	return result;
}
	public static Product mostExpensive(Product...products) {
		Product result = products[0];
		for (Product currentProduct : products) {
			if (currentProduct.getPrice()>result.getPrice()) {
				result = currentProduct;
			}
		}
		return result;
	  
  }
}

