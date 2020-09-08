package com.softserve.edu07;

public class Appl {
    public static void main(String[] args) {
        int num = 11;
        double data = 12.5;
        //
//        data = num;  
//        System.out.println("data = " + data);
        //
        // num = data; // Compile Error
        num = (int) data; // Code Smell
        System.out.println("num = " + num);
        //
        A a = new A();
        B b = new B();
        a = b; // OK
        // b = a; // Error
    }
}
