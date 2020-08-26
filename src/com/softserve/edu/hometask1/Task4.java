package com.softserve.edu.hometask1;

import java.util.Scanner;

/**Define String variables name and address. Output question "What is your name?"
 * Read the value name and output next question: “Where are you live, (name)?".
 * Read address and write whole information
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        System.out.println("Where do you live?");
        Scanner sc2 = new Scanner(System.in);
        String address = sc2.nextLine();
        System.out.println(name + " lives in/at " + address);
    }
}
