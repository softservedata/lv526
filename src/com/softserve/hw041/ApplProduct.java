package com.softserve.hw041;

public class ApplProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Coffe", 100, 10);
        Product p2 = new Product("Milk", 50, 8);
        Product p3 = new Product("Water", 10, 100);
        Product p4 = new Product("Bred", 12, 4);
        //
        Product bigQuantity = Product.biggestQuantity(p1, p2, p3, p4);
        System.out.println("name = " + bigQuantity.getName());
        //System.out.println("biggestQuantity = " + Product.biggestQuantity(p1, p2, p3, p4));
        //
    }
}
