package com.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {
    static String c1, c2, c3;
    static int t1, t2, t3;

    static int summator() {
        return t1 + t2 + t3;
    }

    public static void main(String[] args) throws IOException {
        HomeWork5 homeWork5 = new HomeWork5();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first call country");
        c1 = bufferedReader.readLine();
        System.out.println("Please enter first call time from " + c1 + " in minutes");
        t1 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Please enter second call country");
        c2 = bufferedReader.readLine();
        System.out.println("Please enter second call time from " + c2 + " in minutes");
        t2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Please enter third call country");
        c3 = bufferedReader.readLine();
        System.out.println("Please enter third call time from " + c3 + " in minutes");
        t3 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("First call was from " + c1 + " and continued for about " + t1 + " minutes");
        System.out.println("Second call was from " + c2 + " and continued for about " + t2 + " minutes");
        System.out.println("Third call was from " + c3 + " and continued for about " + t3 + " minutes");
        System.out.println("Summ of all calls is :" + summator() + " minutes");
    }

}
