package com.softserve.edu05;

import java.io.PrintStream;

public class ProductMain {
    public static void main(String[] args) {
        Product pr1 = new Product("Kyyiv cake", 300, 15);
        Product pr2 = new Product("Jack Daniels", 500, 120);
        Product pr3 = new Product("PS5", 13500,0);
        if(pr1.getPrice()>pr2.getPrice()&&pr1.getPrice()>pr3.getPrice())
            System.out.println("The most expensive item is: " + pr1.toString());
        else if (pr2.getPrice()>pr3.getPrice())
            System.out.println("The most expensive item is: " + pr2.toString());
        else
            System.out.println("The most expensive item is: " + pr3.toString());

        if(pr1.getQuanity()>pr2.getQuanity()&&pr1.getQuanity()>pr3.getQuanity()) {
            System.out.println("Name of the items, which has the biggest quantityis: " + pr1.toString());
        } else if (pr2.getQuanity()>pr3.getQuanity())
            System.out.println("Name of the items, which has the biggest quantityis: " + pr2.toString());
        else
            System.out.println("Name of the items, which has the biggest quantityis: " + pr3.toString());

    }
}
