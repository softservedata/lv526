package com.softserve.edu08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Prtask2 {
	
	 private static Scanner scan = new Scanner(System.in);

	 public static void closeScanner() {
	        if (scan != null) {
	            scan.close();
	            scan = null;
	        }
	 }
	 
	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(3465, "Anna");
		employeeMap.put(3956, "Mariia");
		employeeMap.put(1345, "Orest");
		employeeMap.put(1745, "Diana");
		employeeMap.put(2956, "Maxsym");
		employeeMap.put(9705, "Oleg");
		employeeMap.put(4567, "Anna");
		
		System.out.println("\temployeeMap:");
		for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
			System.out.println("Key = " + entry.getKey()  + " Value = " + entry.getValue());
		}
		
		checkName(employeeMap);
		checkID(employeeMap);
		
		closeScanner();
	
	}

	public static <K, V> void checkName(Map <K, V> map) {
		System.out.print("Enter ID = ");
		Integer input = Integer.parseInt(scan.nextLine());
		
		if (map.containsKey(input)){
			System.out.println("Value is " + map.get(input));
		} else {
			System.out.println("ID is not found");
		}
	
	}
	
	public static <K, V> void checkID(Map <K, V> map) {
		System.out.print("Enter name = ");
		String input1 = scan.nextLine();
		
		if(map.containsValue(input1)) {
			for (Map.Entry<K, V> entry : map.entrySet()) {
			    if (entry.getValue().equals(input1)) {
				System.out.println("ID is "+ entry.getKey());
			    }
			}
			    	}else {
			 System.out.println("ID is not found"); 
			    	}
	}
}
