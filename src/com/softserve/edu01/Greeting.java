package com.softserve.edu01;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
	
		Scanner mysc = new Scanner(System.in);
		System.out.println("How are you?");
        String answer = mysc.nextLine();
        System.out.print("You are " + answer);
	
	}

}
