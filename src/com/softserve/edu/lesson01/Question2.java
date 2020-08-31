package com.softserve.edu.lesson01;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		String name;
		String adress;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is you'r name?");
		name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		adress = sc.nextLine();
		System.out.print("Hello, you'r name is " + name + ". You're live in " + adress);	
	}
}
