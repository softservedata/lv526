package chapter8;

import java.util.Scanner;

public class HomeWork1 {
    private static void scaner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sentense ");
        String mYsentense = scanner.nextLine();
        System.out.println(mYsentense);
        String s = mYsentense;
        String[] word = s.split(" ");
        String longword = " ";
        for (int i = 0; i < word.length; i++) {
            for (int j = 1 + i; j < word.length; j++) {
                if (word[i].length() >= word[j].length()) {
                    longword = word[i];
                }
            }
        }
        System.out.println(longword + " is longest word with " + longword.length() + " characters");

        String words[] = word[1].split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString();
            System.out.println(reverseWord);
            System.out.println(mYsentense.replace(word[1], reverseWord));

        }
    }

    public static void main(String[] args) {
        scaner();
    }

}