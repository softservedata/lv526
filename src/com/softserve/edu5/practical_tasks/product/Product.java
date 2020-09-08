package com.softserve.edu5.practical_tasks.product;
/*
    Create class Product with fields name,price and quantity
    1. Create four instances of type Product.
    2. Display the name and quantity of the most expensive item.
    3. Display the name of the items, which has the biggest quantity.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "";
        this.price = 0.0D;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Product[name ='" + this.name + '\'' + ", price =" + this.price + ", quantity =" + this.quantity + ']';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Product other = (Product)o;
            if (this.price != other.price || this.quantity != other.quantity || this.name == null && other.name != null || this.name != null && other.name == null) {
                return false;
            } else {
                return this.name == null && other.name == null ? true : this.name.equals(other.name);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.name != null ? this.name.hashCode() : 0;
        long temp = Double.doubleToLongBits(this.price);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        result = 31 * result + this.quantity;
        return result;
    }

    public static void main(String[] args) {
        Product pd = new Product();
        Product pd_1 = new Product("Coka-cola", 15.0D, 100);
        Product pd_2 = new Product("Pepsi", 13.0D, 85);
        Product pd_3 = new Product("Fanta", 12.0D, 135);
        Product pd_4 = new Product("Mirinda", 14.0D, 135);
        if (pd.getPrice() < pd_1.getPrice()) {
            pd.setQuantity(pd_1.getQuantity());
            pd.setName(pd_1.getName());
            pd.setPrice(pd_1.getPrice());
        }

        if (pd.getPrice() < pd_2.getPrice()) {
            pd.setQuantity(pd_2.getQuantity());
            pd.setName(pd_2.getName());
            pd.setPrice(pd_2.getPrice());
        }

        if (pd.getPrice() < pd_3.getPrice()) {
            pd.setQuantity(pd_3.getQuantity());
            pd.setName(pd_3.getName());
            pd.setPrice(pd_3.getPrice());
        }

        if (pd.getPrice() < pd_4.getPrice()) {
            pd.setPrice(pd_4.getPrice());
            pd.setName(pd_4.getName());
            pd.setQuantity(pd_4.getQuantity());
        }

        System.out.println("The most expensive item =[Name = " + pd.getName() + ", Quantity = " + pd.getQuantity() + "]");
        if (pd.getQuantity() < pd_1.getQuantity()) {
            pd.setQuantity(pd_1.getQuantity());
            pd.setName(pd_1.getName());
        }

        if (pd.getQuantity() < pd_2.getQuantity()) {
            pd.setQuantity(pd_2.getQuantity());
            pd.setName(pd_2.getName());
        }

        if (pd.getQuantity() < pd_3.getQuantity()) {
            pd.setQuantity(pd_3.getQuantity());
            pd.setName(pd_3.getName());
        }

        if (pd.getQuantity() < pd_4.getQuantity()) {
            pd.setQuantity(pd_4.getQuantity());
            pd.setName(pd_4.getName());
        }

        System.out.println("Object with the most big quantity := [" + pd.getName() + "]");
    }
}
