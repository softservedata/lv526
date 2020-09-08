package chapter4;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
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

    private static Object mostExpensive(Product p1, Product p2, Product p3, Product p4) {
        int largest = 0;
        Object large = null;
        Object[] masuv = new Object[4];
        masuv[0] = p1;
        masuv[1] = p2;
        masuv[2] = p3;
        masuv[3] = p4;
        for (int i = 0; i < masuv.length; i++) {
            if (masuv[i].hashCode() > largest) {
                largest += masuv[i].hashCode();
                large = masuv[i];
            } else {
                continue;
            }
        }
        return large;
    }
   /*
    private static Object biggestQuantity(Product p1 , Product p2 , Product p3 , Product p4 ){
        int quantity = 0;
        Object large = null;
        Object[] masuv = new Object[4];
        masuv[0] = p1;
        masuv[1] = p2;
        masuv[2] = p3;
        masuv[3] = p4;
        for (int i = 0; i < masuv.length; i++) {
            if (masuv[i] ???? > quantity) {
                quantity += masuv[i].hashCode();
                large = masuv[i];
            } else {
                continue;
            }
        }
        return large;

    }
*/
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {
        return price;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Chocolate", 10, 2);
        Product product2 = new Product("Bread", 5, 20);
        Product product3 = new Product("Chease", 2, 20);
        Product product4 = new Product("Tomato", 11, 40);

        System.out.println("The most expensive product is : " + mostExpensive(product1, product2, product3, product4));
    }
}
