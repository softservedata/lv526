package com.softserve.edu.homework;

import java.util.Scanner;

public class Define_string_variable {
	private static Scanner fromUser;
	public static void main(String [] args) { 
		
		fromUser = new Scanner (System.in);
		System.out.println("How are you?");
		String answer = fromUser.nextLine();
		System.out.println("You are "+ answer +"!");
		
	}

}
