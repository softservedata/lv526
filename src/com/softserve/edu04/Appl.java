package com.softserve.edu04;

public class Appl {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("st1.firstName = " + st1.firstName);
        System.out.println("st1.lastName = " + st1.lastName);
        //System.out.println("st1.age = " + st1.age); // not visible
        st1.printAge();
    }
}
