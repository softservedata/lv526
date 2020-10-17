package com.softserve.edu.task7;

import java.util.Scanner;

public class Hwork1 {
    private static void checkScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 words ");
        String myText = scanner.nextLine();
        System.out.println(myText);
        String s = myText;
        String[] myValue = s.split("\\s+");
        String longW = myValue[0];
        for (int i = 0; i < myValue.length; i++) {
                if (myValue[i].length() > longW.length()) {
                    longW = myValue[i];
                }
        }
        System.out.println(longW + " is longest word with " + longW.length() + " characters");

        String reverseW = (new StringBuilder(myValue[1])).reverse().toString();
            System.out.println(reverseW);
            System.out.println(myText.replace(myValue[1], reverseW));
        }
    public static void main(String[] args) {
        checkScanner();

    }

}