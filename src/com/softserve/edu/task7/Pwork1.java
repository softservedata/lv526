package com.softserve.edu.task7;

import java.util.Scanner;

public class Pwork1 {

    private static void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your word in check : ");
        String second = scanner.nextLine();
        System.out.println(" Please enter your words : ");
        String first = scanner.nextLine();
        System.out.print("Возвращаемое значение: " );
        System.out.println(first.toUpperCase().matches("(.*)" + second.toUpperCase() + "(.*)"));
    }
    public static void main(String[] args) {
        Pwork1.check();
    }

}