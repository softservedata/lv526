package com.softserve.edu07;

public class AppAB {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B(1);
        System.out.println("b.getI() = " + b.getI());
        System.out.println("b.j = " + b.j);
        //b.Hello();
        //b.Privet();
        //b.k = 1111;
        //System.out.println("b.k = " + b.k);
        //System.out.println("IA.r = " + IA.r);
        // b.r = 2222; // Compile Error
        System.out.println("b.r = " + b.r); // Architecture Error
    }
}
