package com.softserve.edu.task7;

import java.util.Scanner;

public class Hwork2 {

    private static void delete() {

        Scanner scanner = new Scanner(System.in);
                System.out.println(" Please enter your words : ");
                String myWords = scanner.nextLine();
                myWords = myWords.replaceAll("\\s+", " ");
                System.out.println(myWords);
            }

    public static void main(String[] args) {
        delete();
    }
}