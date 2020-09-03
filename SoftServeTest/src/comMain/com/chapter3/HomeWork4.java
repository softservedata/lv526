package com.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    static String name;
    static String address;


    public static void main(String[] args) throws IOException {
        HomeWork4 homeWork4 = new HomeWork4();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        name = bufferedReader.readLine();
        System.out.println("Where are you live," + name + " ?");
        address = bufferedReader.readLine();
        System.out.println(name + ", you are living on " + address + " street");
        System.out.println("Thank you , for your information!");
    }
}
