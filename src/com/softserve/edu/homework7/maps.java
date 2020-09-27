package com.softserve.edu.homework7;

import java.util.Map;

import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {

		Map<String, String> mapPeople = new TreeMap<String, String>();

		mapPeople.put("Petrenko", "Ivan");
		mapPeople.put("Demko", "Orest");
		mapPeople.put("Danylko", "Taras");
		mapPeople.put("Semkiv", "Orest");
		mapPeople.put("Bereza", "Vasyl");
		mapPeople.put("Tot", "Dmytro");
		mapPeople.put("Ilkiv", "Oleg");
		mapPeople.put("Lemko", "Ira");
		mapPeople.put("Bilyk", "Olha");
		mapPeople.put("Pavlik", "Olena");

		mapPeople.forEach((k, v) -> System.out.println(k + " " + v + ";"));

		boolean remove = mapPeople.remove("Demko", "Orest");
		
		System.out.println("\n It is - "+remove+"\n");
		
		mapPeople.forEach((k, v) -> System.out.println(k + " " + v + ";"));

	}
}