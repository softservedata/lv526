package com.softserve.edu.lesson07.homework.task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static <K, V> void sameName(Map<K, V> map) {
		int i;
		i = 0;
		Map<K, V> result = new HashMap<K, V>(map);
		for (Map.Entry<K, V> entry1 : result.entrySet()) {
			for (Map.Entry<K, V> entry2 : result.entrySet()) {
				if (entry1.getValue().equals(entry2.getValue()) && !entry1.getKey().equals(entry2.getKey())) {
					i++;
				}
			}
		}
		if (i < 2) {
			System.out.println("Less then two people have the same name");
		} else {
			System.out.println("Two or more people have the same name");
		}
	}

	public static <K, V> Map<K, V> removeByFirstName(Map<K, V> map, String name) {
		Map<K, V> result = new HashMap<K, V>(map);
		for (Map.Entry<K, V> entry1 : result.entrySet()) {
			if (entry1.getValue().equals(name)) {
				result.remove(entry1.getKey());
				return result;
			}
		}
		System.out.println("No find name " + name + " in Map");
		return result;
	}

	public static void main(String[] args) {

		String name = "Orest";
		//
		Map<String, String> personMap = new HashMap<>();
		//
		personMap.put("Ivaniukh", "Andriy");
		personMap.put("Onysko", "Lesia");
		personMap.put("Tutska", "Olena");
		personMap.put("Tkach", "Lada");
		personMap.put("Petrash", "Okasana");
		personMap.put("Zalutskiy", "Dmutro");
		personMap.put("Orestiuk", "Orest");
		personMap.put("Lolov", "Andriy");
		personMap.put("Shevchenko", "Taras");
		personMap.put("Petrenko", "Andriy");
		personMap.put("Ivanov", "Ivan");
		//
		System.out.println("PersonMap = " + personMap);
		//
		sameName(personMap);
		personMap = removeByFirstName(personMap, name);
		//
		System.out.println("PersonMap = " + personMap);
	}

}
