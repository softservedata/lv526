package com.softserve.edu.task3.country;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        String upperCasedCountry = country.toUpperCase();
        Country country1 = Country.valueOf(upperCasedCountry);
        System.out.println(country1.getContinent());
    }
}

