package com.softserve.edu.homework7.intersection;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
	
	public static<T>Set<T> union(Set<T> set1, Set<T> set2){
	     Set<T> result = new HashSet<>(set1);
	     result.addAll(set2);
	     return result;
    }
	public static<T>Set<T> intersection(Set<T> set1, Set<T> set2){
	     Set<T> result = new HashSet<>(set2);
	     result.addAll(set2);
	     return result;
   }
	
	
	public static void main(String[] args) {
		
        Set<String> set1 = new HashSet<>();
        set1.add("Danylo");
        set1.add("Roman");
        set1.add("Oleg");
        set1.add("Julia");
        set1.add("Olga");
        System.out.println("Set 1: \t\t"+set1);
        
        Set<String> set2 = new HashSet<>();
        set2.add("Petro");
        set2.add("Dmytro");
        set2.add("Ivan");
        set2.add("Julia");
        set2.add("Olga");
        set2.add("Roman");
        System.out.println("Set 2: \t\t"+set2);
        
        System.out.println("Union: \t\t"+ union(set1, set2));
        System.out.println("Intersection: \t"+ intersection(set1, set2));
	}
}