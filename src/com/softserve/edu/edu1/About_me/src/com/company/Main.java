package com.company;

import java.util.Scanner;

public class Main {

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
