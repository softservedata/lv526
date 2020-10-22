package com.softserve.edu.ItIsMyProject.myTest001;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\MyFiles\\javaLike.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }
}