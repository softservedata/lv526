package com.softserve.edu.lesson07.homework.task1;

import java.util.Set;
import java.util.TreeSet;

public class task1 {

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		// Set<E> set = new HashSet<>(set2);
		Set<E> set = new TreeSet<>(set2);
		set.addAll(set2);
		return set;
	}

	public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
		// Set<E> set = new HashSet<>(set1);
		Set<E> set = new TreeSet<>(set1);
		set.retainAll(set2);
		return set;
	}

	public static void main(String[] args) {
		// Set<String> set1 = new HashSet<>();
		Set<String> set1 = new TreeSet<>();
		set1.add("Ivan");
		set1.add("Vasul");
		set1.add("Lesia");
		set1.add("Andriy");
		set1.add("Kolia");
		set1.add("Olena");
		//
		System.out.println("Set1 = " + set1);
		//
		// Set<String> set2 = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		set2.add("Taras");
		set2.add("Ivan");
		set2.add("Petro");
		set2.add("Yaruna");
		set2.add("Kolia");
		set2.add("Natalia");
		//
		System.out.println("Set2 =" + set2);
		//
		System.out.println("Union = " + union(set1, set2));
		System.out.println("Intersection = " + intersect(set1, set2));

	}
}
