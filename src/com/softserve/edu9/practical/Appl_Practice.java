package com.softserve.edu9.practical;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl_Practice {
    public static void main(String[] args) {
        //1
        Scanner  sc = new Scanner(System.in);
        String a =  sc.nextLine();
        String pattern = a;
        String text = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m =  p.matcher(text);
        if(m.matches()){
            System.out.println();
            }
        m.reset();
        if (m.find() ){
            System.out.println(true);
        }
        //2
        String pattern1 = "\\w+\\s\\w{1}"; //tut problem
        String pattern2 = "\\s\\b\\w+\\b";
        String pattern3 = "\\w+\\s+\\w+\\s+\\w+";
        String text1  = sc.nextLine();

        Pattern p1 = Pattern.compile(pattern1);
        Pattern p2 = Pattern.compile(pattern2);
        Pattern p3 = Pattern.compile(pattern3);

        Matcher m1 = p1.matcher(text1);
        Matcher m2 = p2.matcher(text1);
        Matcher m3 = p3.matcher(text1);

        if (m3.matches()){
            System.out.println();
        }
        m1.reset();
        m2.reset();
        m3.reset();

        if (m3.find() && m1.find() && m2.find()){
            System.out.println("Surname = " + text1.substring(m1.start(),m1.end()));
            System.out.println("Name = "+ text1.substring(m2.start(),m2.end()));
            System.out.println("Name + Surname + Patronymic = "+text1.substring(m3.start(),m3.end()));
        }
        //3
        System.out.println("Input name which contain  from 3 till 15 characters ");
        Pattern p4 = Pattern.compile("\\S{3,15}");
        Matcher m4;
        String text2;
        for (int i = 0; i <=5; i++) {
          text2 = sc.nextLine();
            m4= p4.matcher(text2);
            if (m4.matches()) {
                System.out.println("Good");
            }else System.out.println("Bad");

        }

    }
}
