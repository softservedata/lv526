package com.softserve.edu07;

public class AppFormula {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt1(a * 100);
            }
        };
        System.out.println("calculate(16) = " + formula.calculate(16));
    }
}
