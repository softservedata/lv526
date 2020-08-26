package com.softserve.edu.homework;

import java.util.Scanner;
public class Phone_calls {
	
	private static Scanner fromUser;
		
	public static void main(String[] args) {
		fromUser = new Scanner (System.in);
    int c1, c2, c3, t1,t2, t3, total;
    
    System.out.println("Enter the cost of a call from the country ¹1");
    c1 = fromUser.nextInt();
    System.out.println("Enter the cost of a call from the country ¹2");
    c2 = fromUser.nextInt();
    System.out.println("Enter the cost of a call from the country ¹3");
    c3 = fromUser.nextInt();
    System.out.println("Enter the duration of the call from the country ¹1");
    t1 = fromUser.nextInt();
    System.out.println("Enter the duration of the call from the country ¹2");
    t2 = fromUser.nextInt();
    System.out.println("Enter the duration of the call from the country ¹3");
    t3 = fromUser.nextInt();
    System.out.println("The cost of a call from the country ¹1: " + c1*t1);
    System.out.println("The cost of a call from the country ¹2: " + c2*t2);
    System.out.println("The cost of a call from the country ¹3: " + c3*t3);
    total = c1*t1+c2*t2+c3*t3;
    
    System.out.println("Total cost of calls: " + total);    
	}

}
