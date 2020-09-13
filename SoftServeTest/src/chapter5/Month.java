package chapter5;

import java.util.Scanner;

public class Month {

    private static void monthGenerator() {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        System.out.println("Please enter Month number from 1 to 12");
        monthNumber = scanner.nextInt();
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
            System.out.println("\n 31 Days in the month");
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            System.out.println("\n 30 Days in mont");
        } else if (monthNumber == 2) {
            System.out.println(" \n 28 Days in month");
        } else {
            System.out.println("Valid number of month");
        }


    }


    public static void main(String[] args) {
    monthGenerator();

    }
}
