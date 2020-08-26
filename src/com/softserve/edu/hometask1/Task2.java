package com.softserve.edu.hometask1;

import java.util.Scanner;

/**Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println("How are you?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
    }
}
