package com.softserve.edu.homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt3 {

	public static void main(String[] args) {

		List<String> user = new ArrayList<>();
		user.add("Taras24");
		user.add("Bohd@n");
		user.add("Iv_an");
		user.add("Roman");
		user.add("Ol&g");

		String pattern = "\\w{3,15}";
		Pattern p = Pattern.compile(pattern);
		for (String us : user) {
			Matcher m = p.matcher(us);
			System.out.println(m.matches() ? "Name: " + us + " - is correct." : 
				                             "Name: " + us + " - is not correct!");
		}
	}
}