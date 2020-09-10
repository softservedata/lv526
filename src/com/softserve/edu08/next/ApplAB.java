package com.softserve.edu08.next;

import com.softserve.edu08.ClassA;
import com.softserve.edu08.ClassB;

public class ApplAB extends ClassA {
    
    public static void main(String[] args) {
        System.out.println("The Start.");
        /*-
        System.out.println("Test ClassA.");
        ClassA a;
        a = new ClassA();
        System.out.println("a.i = " + a.i);
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        a.m6(); // Warning. ClassA.m6();
        a.m7();
        //a.m8(); // error
        ApplAB ab = new ApplAB();
        ab.m8();
        */
        //
        System.out.println("Test ClassB.");
        ClassA b; //= null;
        //System.out.println("b.i = " + b.i); // Compile Error, not init 
        b = new ClassB();  // Polymorphism_1
        System.out.println("b.i = " + b.i); // from A, fields not virtual; Architecture Error; Fields must be private 
        b.m1();  // Polymorphism_2
        b.m2();
        b.m3();  // Polymorphism_1 m3() running m4() from ClassB
        b.m4();
        //b.m5(); // Compile ERROR
        //((ClassB) b).m5(); // Code Smell
        if (b instanceof ClassB) {
          ((ClassB) b).m5(); // No Runtime Error
        }
        b.m6(); // Running from ClassA; Architecture Error; Use ClassB.m6();
        //ClassB.m6();
        //b.m8(); // Error for other package
        ((ClassB) b).m8();
        //
        /*-
        System.out.println("Test_0 ClassB.");
        ClassB b0;
        b0 = new ClassB();
        System.out.println("b0.i = " + b0.i); // from ClassB 
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5();
        b0.m6(); // from ClassB 
        b0.m8();
        */
        System.out.println("The End.");
    }
}
