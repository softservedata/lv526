package com.softserve.edu09;

import java.util.Scanner;

public class Prtask1_2 {
    public static void main(String[] args) {

        String s1 = "Khrystyna";
        String s2 = "My name is Khrystyna.";
        System.out.println(s2.contains(s1));

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = scan.nextLine();
        System.out.print("Enter your patronymic ");
        String patronymic = scan.nextLine();
        System.out.print("Enter your surname ");
        String surname = scan.nextLine();
        scan.close();

        System.out.printf("%s %.1S. %.1S.%n", surname, name, patronymic);
        System.out.println(name);
        System.out.printf("%s %s %s", name, patronymic, surname);


    }
}
