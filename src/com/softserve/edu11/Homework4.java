package com.softserve.edu11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework4 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Admin\\Desktop\\file1.txt";
		String path1 = "C:\\Users\\Admin\\Desktop\\file2.txt";
		List<String> list = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String s;
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File " + path + "is not found");
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s:list) {
			System.out.println(s);
		}
		
		try( BufferedWriter bw = new BufferedWriter(new FileWriter(path1))){
			
			bw.write(String.valueOf(list.size()));
			bw.newLine();
			bw.write(longest(list));
			bw.newLine();
			bw.write("My name is Khrystyna. I was born on the 31 of March 1994.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	public static String longest(List<String> l) {
		String max = "";
		for (String s : l) {
			if (s.length() > max.length()) {
				max = s;
			}
		}

		return max;
	}

}
