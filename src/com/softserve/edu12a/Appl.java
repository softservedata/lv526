package com.softserve.edu12a;

public class Appl {
    public static void main(String[] args) {
        DialogTime dt = new DialogTime();
        dt.setVisible(true); // Create new Thread for UI form
        System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
    }
}
