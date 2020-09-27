package com.softserve.edu.homework7.pt2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<>();

		employeeMap.put(1, "Ivan");
		employeeMap.put(2, "Orest");
		employeeMap.put(3, "Taras");
		employeeMap.put(4, "Oleg");
		employeeMap.put(5, "Vasyl");
		employeeMap.put(6, "Dmytro");
		employeeMap.put(7, "Igor");

		employeeMap.forEach((k, v) -> System.out.println(k + " " + v + ";"));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the person's id: ");

		int id = scan.nextInt();

		if (employeeMap.containsKey(id)) {

			System.out.println("Person's name is -  " + employeeMap.get(id));
		} else
			System.out.println("Id not found!");

		System.out.println("Enter the person's name: ");

		String name = scan.next();

		Iterator<Map.Entry<Integer, String>> iterator = employeeMap.entrySet().iterator();

		if (employeeMap.containsValue(name)) {

			while (iterator.hasNext()) {

				Map.Entry<Integer, String> entry = iterator.next();

				if (entry.getValue().equals(name)) {

					System.out.println("Id of the person = " + entry.getKey());
				}
			}
		} else
			System.out.println("There is no person with this name.");
		scan.close();
	}
}