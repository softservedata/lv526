package com.softserve.edu11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrTask3 {

	public static void main(String[] args){
		String filename = "C:\\Users\\Admin\\Desktop\\mytext.txt";
		
		List<String> list = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String s;
			while ((s=br.readLine()) != null) {
				list.add(s);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(x -> System.out.println(x));
//		for (String l:list) {
//			System.out.println(l);	
//		}
		//1
		for (String l:list) {
			System.out.println(l.length());	
		}
		//2
		System.out.println(getMax(list));// Longest line
		System.out.println(getMin(list));// Shortest line
		
		//3
		
		match("var", list);
		
	}

	public static String getMax(List<String> l) {
		String max = "";
		
		for (String s:l) {
			if (max.length()<s.length()) {
				max = s;
			}
		}
		return max;
	}
	
	public static String getMin(List<String> l) {
		String min = l.get(0);
		for (String s:l) {
			if (min.length()>s.length()) {
				min = s;
			}
		}
		return min;
	}
	
	public static void match(String reg, List<String> l) {
		Pattern p = Pattern.compile(reg);
		String result = null;
		
		for (String s : l) {
			Matcher m = p.matcher(s);
			if (m.find()) {
				result = s;
			} 
		}
		
		if (result!=null) {
			System.out.println(result);
		}else {
			System.out.println("Line with "+reg+ " wasn't found");
		}
	}
}
