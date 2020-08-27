package com.softserve.edu04.next;

public class Util {
    
    public static void print(String welcomeMessage, Object... messages) {
        System.out.print(welcomeMessage);
        for (Object msg : messages) {
            System.out.print(", " + msg);
        }
        System.out.println();
    }
    
}
