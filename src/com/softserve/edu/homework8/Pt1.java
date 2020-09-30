package com.softserve.edu.homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt1 {

	public static void main(String[] args) {
		
		String s1 = new String("IT");
		String s2 = new String("ITAcademy");
		
		Pattern p = Pattern.compile(s1);
		Matcher m = p.matcher(s2);
		
		if (m.matches()) {
			System.out.println();
		}
		m.reset();
		
		while (m.find()) {
			System.out.print("True");
			
		}
	}
}
