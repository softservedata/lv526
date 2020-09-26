package com.softserve.edu9.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sV = sc.nextLine();
        System.out.println("Return string :");
        String [] arr = sV.split("\\s") ;
        StringBuilder longWord = null;
        int lengthWord = 0;

        for (int i = 0; i < arr.length; i++) {
          if (arr[i].length()> lengthWord){
              longWord = new StringBuilder(arr[i]);
              lengthWord = arr[i].length();
          }
        }
        StringBuilder secWord = new StringBuilder(arr[1]);
        System.out.println("Longest word = "+ longWord);
        System.out.println("Longest word length = "+ lengthWord);
        System.out.println("Second word reverse "+secWord.reverse());

       // 2 Problem
        String sent = sc.nextLine();
        String newS = null;
        for (int i = 0; i < sent.length(); i++) {
            for (int j = 1; j < sent.length(); j++) {
                if (sent.substring(i,j).equals("_")){
                    newS.concat("_");
                }
            }
        }
        //3
        String txt  = sc.nextLine();
        String pat  = "\\${1}\\d+\\.\\d{2}";
        Pattern p5 = Pattern.compile(pat);
        Matcher m5 = p5.matcher(txt);

        if (m5.matches()){
            System.out.println("Completely good");
        }
        m5.reset();
        if (m5.find()){
            System.out.println("Money = "
                    + txt.substring(m5.start(),m5.end()));
        }
    }
}


