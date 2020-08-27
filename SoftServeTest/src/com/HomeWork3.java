package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {

    public void perimeterCalculator(int i) {
        System.out.println("Perimeter is :" + (2 * 3.14 * i));
    }

    public void areaCalculator(int a) {
        double testVariable = 3.14 * a;
        System.out.println("Area is :" + (Math.pow(testVariable, 2)));
    }

    public static void main(String[] args) throws IOException {
        HomeWork3 homeWork3 = new HomeWork3();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius sircle :");
        int radius = Integer.parseInt(bufferedReader.readLine());
        homeWork3.perimeterCalculator(radius);
        homeWork3.areaCalculator(radius);
    }
}
