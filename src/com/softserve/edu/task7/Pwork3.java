package com.softserve.edu.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pwork3 {

    public static boolean regularNameValue(String username) {
        Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = pattern.matcher(username);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(regularNameValue("badmens_66"));
        System.out.println(regularNameValue("badwomenxa_33"));
        System.out.println(regularNameValue("xaiambadmen_11"));
    }
}