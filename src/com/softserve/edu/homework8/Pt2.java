package com.softserve.edu.homework8;

import java.util.Scanner;

public class Pt2 {

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.print("Enter your surname: ");
        String surname = scan.nextLine();
		System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter your patronymic: ");
        String patronymic = scan.nextLine();
        
        scan.close();

        System.out.printf("Surnames and initials:\t\t %s %.1S. %.1S.%n", surname, name, patronymic);
        System.out.println("Name:\t\t\t\t "+ name);
        System.out.printf("Name, middle name and last name: %s %s %s", name, patronymic, surname);

    }
}