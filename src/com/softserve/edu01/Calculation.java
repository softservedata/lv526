package com.softserve.edu01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input int: a = ");
        String text1 = br1.readLine();
        int a = Integer.parseInt(text1);
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input int: b = ");
        String text2 = br2.readLine();
        int b = Integer.parseInt(text2);
       
        System.out.println("a + b = " + a + b);
        System.out.println("a - b = "+ (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
	}

}
