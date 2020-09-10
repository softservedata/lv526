package com.softserve.edu08.next;

//import com.softserve.edu08.next.Child;

public class OOPSamples {
    public static void main(String... args) {
        Child child = new Child();
        //Parent child = new Child();
        System.out.println("child.useF(): " + child.useF());
        System.out.println("child.useF2(): " + child.useF2());
        System.out.println("child.f(): " + child.f()); // Architecture Error
    }
}