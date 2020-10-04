package com.softserve.edu10.practical;

import java.util.Scanner;

public class Calculation {

    public  int squareRectangle(int a, int b){
        int res= 0;

        if ( 0>a  || b>0 ){
            throw new ArithmeticException("Negative values");
        }
        res = a*b;
        System.out.println(res);
        return  res;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Calculation ca = new Calculation();

                ca.squareRectangle(sc.nextInt(),sc.nextInt());

    }
}
