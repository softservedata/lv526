package com.softserve.edu13a;

public class Appl {

    public static void main(String[] args) {
        DialogTime dt = new DialogTime();
        dt.setVisible(true);
        System.out.println("Appl: Thread ID = " + Thread.currentThread().getId());
    }

}