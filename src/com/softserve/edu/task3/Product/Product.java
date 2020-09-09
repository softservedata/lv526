package com.softserve.edu.task3.Product;

class Main {
    public static void main(String[] args) {
        Product products[] = {
                new Product("IceCream", 11, 31),
                new Product("Potatoes", 12, 12),
                new Product("Sweets", 9, 11),
                new Product("Carrot", 7, 9),
        };

        Product max = products[0];

        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > max.getPrice()) {
                max = products[i];
            }
        }
        System.out.println("Product with biggest quantity: " + max.toString());

        Product qua = products[0];

        for (int i = 0; i < products.length; i++) {
            if (products[i].getQuantity() > qua.getQuantity()) {
                qua = products[i];
            }
        }
        System.out.println("Most expensive product: " + qua.toString());
    }
}

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
