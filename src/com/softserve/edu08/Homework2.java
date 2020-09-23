package com.softserve.edu08;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {
	
	public static <K, V> void checkDuplicates(Map<K, V> map) {
		
		Set<V> mapValuesSet = new HashSet<V>(map.values());
		
		if (mapValuesSet.size() == map.size()) {
			System.out.println("There are no duplicates in map values");
		}else {
			System.out.println("There are duplicates in map values");
		}
		
	}
	
	public static <K, V> void removeEntry(Map<K, V> map, V name) {
				
		Iterator<Entry<K, V>> i = map.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry<K,V> entry = i.next();
			if (entry.getValue().equals(name)) {
				i.remove();
			}
	
		}
		
	}

	public static void main(String[] args) {
		
		Map<String, String> personMap = new TreeMap<>();
		
		personMap.put("Andrukh", "Khrystyna");
		personMap.put("Shevchenko", "Olena");
		personMap.put("Kovalenko", "Nazar");
		personMap.put("Kovalchuk", "Oksana");
		personMap.put("Melnyk", "Dmytro");
		personMap.put("Kulyk", "Volodymyr");
		personMap.put("Bondarenko", "Ostap");
		personMap.put("Tkachuk", "Mariia");
		personMap.put("Levchenko", "Nina");
		personMap.put("Mazur", "Mariia");
		
		System.out.println("\tpersonMap:");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		checkDuplicates(personMap);
		
		removeEntry(personMap, "Oksana");
		
		System.out.println("\tupdated personMap:");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}	
}
