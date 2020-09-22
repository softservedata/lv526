package com.softserve.edu.homework4.practicaltasks;

import java.util.Scanner;

public class Ñountries {

	public static void main(String[] args) {
		String country = new String();
		Continents continent = null;
		System.out.println("Enter the name of country: ");
						
		Scanner scan = new Scanner(System.in);
		country = scan.nextLine();
			
		switch (country.toLowerCase()){
		case "china":case "india": case "pakistan": case "japan":
		case "iran": case "vietnam": case "thailand":
			continent = Continents.ASIA;
		    break;
		case "australia": case "new zealand":
			continent = Continents.AFRICA;
			break;
		case "poland": case "ukraine":case"germany":case"france":
			continent = Continents.EUROPE;
			break;
		case "mexico": case "canada":case"cuba":case"panama":
			continent = Continents.NORTH_AMERICA;
			break;
		case "brazil": case "colombia": case "argentina": case "paraguay":case"chile":case"ecuador":
			continent = Continents.SOUTH_AMERICA;
			break;
		case "samoa": case "nauru": case "niue": case"tokelau":
			continent = Continents.AUSTRALIA_OCEANIA;
			break;
		case "none":
			continent = Continents.ANTARCTICA;
			break;
		
		default:
				continent = Continents.UNKNOWN;
		}
		System.out.print("Countinents : " + continent);
		scan.close();
		    	
  }		
}

