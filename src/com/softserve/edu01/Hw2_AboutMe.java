package com.softserve.edu01;

import java.util.Scanner;

    //Define String variables name and address.
    // Output question "What is your name?"
    // Read the value name and output next question: “Where are you live, (name)?".
    // Read address and write whole information.

public class Hw2_AboutMe {

    public static void main(String[] args) {

        String name, addres;
        Scanner sc =new Scanner(System.in);

        System.out.println("What's your name? ");
        System.out.print("I'm ");
        name = sc.nextLine();
        System.out.println("Where are you live, "+ name +" ?");
        System.out.print("I'm from ");
        addres = sc.nextLine();
        System.out.println("Nice to meet you "+ name+ " from "+ addres+")");



    }
}
