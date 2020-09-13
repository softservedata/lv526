package com.softserve.edu05;

import java.util.Scanner;

public class Pracktikal_task05 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0)
                count++;
        }
        System.out.println("Odd numbers are: " + count);

        System.out.print("Enter the number of the day of the week: ");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        System.out.println("List of country: GERMANY, USA, ARGENTINA, EGYPT, AUSTRALIA");
        System.out.print("Enter the name of the country: ");
        String c = sc.nextLine();
        String cU = c.toUpperCase();
        Country country = Country.valueOf(cU);
        System.out.println("Your choice: " + country.getCountry());

    }

}
