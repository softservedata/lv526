package com.softserve.edu04.next;

import com.softserve.edu04.Student;

public class Appl2 {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("st1.firstName = " + st1.firstName);
        // System.out.println("st1.lastName = " + st1.lastName); // not visible
        // System.out.println("st1.age = " + st1.age); // not visible
        st1.printAge();
        //
        st1.printAge(1);
        st1.printAge("1");
        //
        byte b = 1;
        b = (byte) (b + 2); // Code Smell
        System.out.println("b = " + b);
        //
        Util.print("Hello");
        Util.print("Hello", "Ivan");
        Util.print("Hello", "Ivan", "Petro");
        Util.print("Hello", "Ivan", "Petro", 1, 22);
    }
}
