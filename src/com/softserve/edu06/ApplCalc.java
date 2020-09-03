package com.softserve.edu06;

import com.softserve.edu.Calc;

public class ApplCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("2 + 2 = " + calc.add(2, 2));
        System.out.println("20 / 2 = " + calc.div(20, 2));
    }
}
