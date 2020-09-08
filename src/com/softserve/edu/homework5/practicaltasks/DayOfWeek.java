package com.softserve.edu.homework5.practicaltasks;
import java.util.Scanner;
public class DayOfWeek {
	
	public static void main(String [] args) {
		System.out.println("Enter the day of the week, 1 to 7: ");
		Scanner s = new Scanner (System.in);
		int day = s.nextInt();
		String message = null;
		
		switch (day){
		case 1:
			message = "En - Monday, Ua - Ponedilok, De - Montag";
			break;
		case 2:
			message = "En - Tuesday, Ua - Vivtorok, De - Dienstag";
			break;
		case 3:
			message = "Wednesday, Ua - Sereda, De - Mittwoch";
			break;
		case 4:
			message = "Thursday, Ua - Chetver, De - Donnerstag";
			break;
		case 5:
			message = "Friday, Ua - Pyatnytsya, De - Freitag";
			break;
		case 6:
			message = "Saturday, Ua - Subota, De - Samstag";
			break;
		case 7:
			message = "Sunday, Ua - Nedilya, De - Sonntag";
			break;
			default:
				message = "Enter number from 1 to Seven";
				break;
		
		}
		s.close();
		System.out.println(message);
	}
}
