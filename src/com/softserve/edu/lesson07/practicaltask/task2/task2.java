package com.softserve.edu.lesson07.practicaltask.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task2 {

	public static int enterId() {
		System.out.println("Enter ID");
		Scanner scanner = new Scanner(System.in);
		int id;
		id = scanner.nextInt();
		return id;
	}

	//
	public static String enterName() {
		System.out.println("Enter Name");
		Scanner scanner = new Scanner(System.in);
		String name;
		name = scanner.next();
		scanner.close();
		scanner = null;
		return name;
	}

	//
	public static <K, V> void containsKey(Map<K, V> employeerMap, int id) {
		if (employeerMap.containsKey(id)) {
			System.out.println("employeerMap.get(id) = " + employeerMap.get(id));
		} else {
			System.out.println("No find ID");
		}
	}

	public static <K, V extends Comparable<V>> Set<K> containsValue(Map<K, V> employeerMap, V name) {
		Set<K> keys = new HashSet<K>();
		for (Map.Entry<K, V> entry : employeerMap.entrySet()) {
			if (employeerMap.containsValue(name)) {
				if (name.compareTo(entry.getValue()) == 0) {
					keys.add(entry.getKey());
					System.out.println(name + " id = " + entry.getKey());
				}
			}
		}
		if (keys.size() == 0) {
			System.out.println("No find Name");
		}

		return keys;
	}

	//
	public static void main(String[] args) {
		int id = -1;
		String name = null;

		Map<Integer, String> employeerMap = new HashMap<>();

		employeerMap.put(1, "Kolia");
		employeerMap.put(2, "Katia");
		employeerMap.put(3, "Misha");
		employeerMap.put(4, "Oleh");
		employeerMap.put(5, "Arif");
		employeerMap.put(6, "Taras");
		employeerMap.put(7, "Mohammed");
		System.out.println("Original Map" + employeerMap);
		//
		id = enterId();
		//
		containsKey(employeerMap, id);
		//
		name = enterName();
		//
		containsValue(employeerMap, name);

	}
}
