package com.softserve.edu08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Homework1 {
	
	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		
		set1.addAll(set2);
				
		return set1;
	}
	
	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
	
		set1.retainAll(set2);
		
		return set1;
	}

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		
		s.add("Ostap");
		s.add("Halyna");
		s.add("Petro");
		s.add("Oksana");
		s.add("Mariia");
		s.add("Yuliia");
		

		System.out.println("First set = " + s);
		
		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("Dmytro");
		s1.add("Olha");
		s1.add("Khrystyna");
		s1.add("Oksana");
		s1.add("Mariia");
		s1.add("Liliia");
		
		System.out.println("Second set = " + s1);
		
		System.out.println("union: " + Homework1.union(s, s1));
		System.out.println("intersect: " + Homework1.intersect(s, s1));
	}

}
