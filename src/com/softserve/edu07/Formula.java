package com.softserve.edu07;

public interface Formula {
    double calculate(int a);

    default double sqrt1(int a) {
        return Math.sqrt(a);
    }
}
