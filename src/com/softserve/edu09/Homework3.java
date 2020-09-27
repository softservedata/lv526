package com.softserve.edu09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\$([\\d]+)\\.(\\d{2})");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<4; i++){
            System.out.println("Enter amount in the next format: $xx..xx.xx");
            String input = scan.nextLine();
            Matcher m = p.matcher(input);
            System.out.println(input);
            System.out.println(m.matches()?"Entered amount is valid":"Entered amount is not valid");
        }
        scan.close();
    }
}
