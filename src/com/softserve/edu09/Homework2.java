package com.softserve.edu09;

public class Homework2 {
    public static void main(String[] args) {
        String s = "My   name    is   Khrystyna    Andrukh";
        System.out.println("Original sentence: " + s);
        s = s.replaceAll(" {2,}", " ");
        System.out.println("Updated sentence: " + s);
    }
}
