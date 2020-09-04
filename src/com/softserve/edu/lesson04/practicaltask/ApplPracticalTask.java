package com.softserve.edu.lesson04.practicaltask;

import java.util.Scanner;

public class ApplPracticalTask {
	public static void main(String[] args) {
		PracticalTask p = new PracticalTask();
		//p.threeNum();
		//p.week();
		
		//enum continents
		Countinents continents = null;
		String country;
		System.out.print("Enter name of country: ");
		Scanner sc = new Scanner(System.in);
		country = sc.nextLine().toUpperCase();
		switch(country) {
		case "USA":
		case "CANADA":
			continents = Countinents.NORTHAMERICA;
			break;
		case "UKRAINE":
		case "POLAND":
			continents = Countinents.EUROPE;
			break;
		case "CHINE":
		case "INDIA":
			continents = Countinents.ASIA;
			break;
		case "EGYPT":
		case "MADAGASKAR":
			continents = Countinents.AFRICA;
			break;
		case "AUSTRALIA":
		case "NEW ZEALAND":
			continents = Countinents.AUSTRALIA;
			break;
		case "ANTARCTICA":
			continents = Countinents.ANTARCTICA;
			break;
			
	    default:
	    	System.out.print("No found");
	    	System.exit(0);
		}
	    System.out.print("Countinents : " + continents);
	}
}
