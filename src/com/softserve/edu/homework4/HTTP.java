package com.softserve.edu.homework4;

import java.util.Scanner;

public class HTTP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Http Error code = ");
        int httpCode = sc.nextInt();
        HTTPError result = HTTPError.HTTP999;
        try {
        	result = HTTPError.valueOf("HTTP"+String.valueOf(httpCode));
        }catch (Exception e) {
        	System.out.println("Invalid error code");
        }
        System.out.println("Answer: "+ result.getMessage());
        sc.close();
    }
}
