package com.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    public void adder(Integer i1, Integer i2) {
        System.out.println("Сума " + (i1 + i2));
        System.out.println("Віднімання " + (i1 - i2));
        System.out.println("Множення " + (i1 * i2));
        System.out.println("Ділення " + (i1 / i2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first variable : ");
        int variable1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter second variable :");
        int variable2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Ariphmetic output is : ");
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.adder(variable1, variable2);
        //  System.out.print(adder(variable1, variable2));


    }

}
