package com.softserve.edu12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HomeworkSort {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Elephant");
		list.add("Cat");
		list.add("Dog");
		list.add("Tiger");
		
		Stream s = list.stream()
				.sorted(Comparator.reverseOrder());
		s.forEach(System.out::println);
	}
}