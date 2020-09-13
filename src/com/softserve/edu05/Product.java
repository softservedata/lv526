package com.softserve.edu05;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuanity() {
        return quantity;
    }

    public String toString() {
        return "Product " + name + "[price:" + price + ", quanity: " + quantity + "]";
    }
}
