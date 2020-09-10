package chapter4;

public class ProductStarter {
    public static void main(String[] args) {
        Product product1 = new Product("Chocolate", 10, 2);
        Product product2 = new Product("Bread", 5, 20);
        Product product3 = new Product("Chease", 100, 20);
        Product product4 = new Product("Tomato", 11, 40);

        System.out.println("The biggest quantity product is : " + Product.biggestQuantity(product1, product2, product3, product4));
        System.out.println("The most expensive product is : " + Product.mostExpensive(product1, product2, product3, product4));
    }
}
