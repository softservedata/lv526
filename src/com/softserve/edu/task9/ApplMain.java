package com.softserve.edu.task9;

public class ApplMain {
    public static void main(String[] args) {
        Runnable r1 = new Appl1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Appl2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();


    }
}
