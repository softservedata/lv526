package com.softserve.edu.ItIsMyProject;

import java.io.*;

public class MyExam {

    int key = 3;

    public String encrypt(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t >= 'A' && t <= 'Z') {
                int t1 = t - 'A' + key;
                t1 = t1 % 26;
                sb.append((char) (t1 + 'A'));
            } else if (t >= 'a' && t <= 'z') {
                int t1 = t - 'a' + key;
                t1 = t1 % 26;
                sb.append((char) (t1 + 'a'));
            }
        }
        return sb.toString();
    }


    public String decrypt(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t >= 'A' && t <= 'Z') {
                int t1 = t - 'A' - key;
                if (t1 < 0) t1 = 26 + t1;
                sb.append((char) (t1 + 'A'));
            } else if (t >= 'a' && t <= 'z') {
                int t1 = t - 'a' - key;
                if (t1 < 0) t1 = 26 + t1;
                sb.append((char) (t1 + 'a'));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        try {
            System.out.println("Caesar encrypion technique");
            BufferedReader b;
            String oriTxt, encTxt, decTxt;
            System.out.println("Enter string to encrypt:");
            b = new BufferedReader(new InputStreamReader(System.in));
            oriTxt = b.readLine();
            MyExam c = new MyExam();
            encTxt = c.encrypt(oriTxt);
            System.out.println("Encrypted text :" + encTxt);
            decTxt = c.decrypt(encTxt);
            System.out.println("Derypted text :" + decTxt);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
