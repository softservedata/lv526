package com.softserve.edu.homework8.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class USCurrency {

	Scanner sc = new Scanner(System.in);

	public void getMatches() {
		String pattern = "\\$\\d*\\.\\d{2}";
		System.out.println("Please enter US currency:\s");
		String text = sc.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		if (m.matches()) {
			System.out.println("m.matches() OK");
		}
		m.reset();
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
	}
}

public class USD {

	public static void main(String[] args) {
		
		USCurrency us = new USCurrency();
		us.getMatches();
	}
}