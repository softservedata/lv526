package com.softserve.edu.task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hwork3 {
    public static boolean checkWithRegExp() {
        Scanner scaner = new Scanner(System.in);
        System.out.print(" Please enter your value : ");
        String myValue = scaner.nextLine();
        Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = pattern.matcher(myValue);
        return m.matches();

    }

    public static void main(String[] args) {
        System.out.println(checkWithRegExp());
    }


}