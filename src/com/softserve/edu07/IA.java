package com.softserve.edu07;

public interface IA {
    int r = 555;
    
    int getI();
    
    default void Privet() {
        System.out.println("Privet");
    }
    
}
