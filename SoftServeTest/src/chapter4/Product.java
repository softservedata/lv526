package chapter4;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Product() {
        name = "";
        price = 0;
        quantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
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
    public static Product biggestQuantity(Product ... products){
        Product result = products[0];
        for (Product product : products){
            if (product.getQuantity()>result.getQuantity()){
                result = product;
            }
        }
        return result;
    }
    public static Product mostExpensive (Product ... products) {
        Product result1 = products[0];
        for (Product product : products) {
            if (product.getPrice() > result1.getPrice()) {
                result1 = product;
            }
        }
        return result1;
    }
}
