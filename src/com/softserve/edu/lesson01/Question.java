package com.softserve.edu.lesson01;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println("How are you?");
		answer = sc.nextLine();
		System.out.println("You are " + answer);		
	}
}
