package com.softserve.edu01;

import java.util.Scanner;

public class Adress {
	public static void main(String[] args) {
		
		String name;
		String address;
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		address = sc.nextLine();
		System.out.println("Your name is " + name + ". Your address is " + address + "." );
	}
	
}
