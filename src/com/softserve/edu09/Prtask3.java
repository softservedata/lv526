package com.softserve.edu09;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prtask3 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\w{3,15}");

        List<String> names = new ArrayList<String>();
        names.add("Khrystyna_15516");
        names.add("Halyna.I");
        names.add("Ira");
        names.add("Iv");
        names.add("Vladyslav_Danyliuk");

        for (String s : names){
            Matcher m = p.matcher(s);
            System.out.println(m.matches()?"Name " + s + " is valid":"Name " + s + " is not valid");
        }
    }






}
