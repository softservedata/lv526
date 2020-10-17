package com.softserve.edu.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherException {

    public static int div() {
        BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            return n / k;
        } catch (NumberFormatException | IOException e) {
            return -1;
        } catch (ArithmeticException e) {
            return -2;
        } catch (Exception e) {
            return -3;  }
    }

    double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0)
            throw new ArithmeticException();
        return Math.sqrt(x);
    }


    void foo(double x) {
        double result;
        try {
            result = safeSqrt(x);
        } catch (ArithmeticException e) {
            System.out.println(e);
            result = -1;
        }
        System.out.println("result: " + result);
    }


    public static void main(String[] args) {
        OtherException oe = new OtherException();
       oe.foo(-4);
    }

}
