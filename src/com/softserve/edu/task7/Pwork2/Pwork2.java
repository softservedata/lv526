package com.softserve.edu.task7.Pwork2;

import java.util.Scanner;

public class Pwork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name : ");
        String firstName = scanner.nextLine();
        System.out.println("Input middle name : ");
        String middleName = scanner.nextLine();
        System.out.println("Input last name : ");
        String lastName = scanner.nextLine();

        Name name = new Name(firstName, middleName, lastName);

        System.out.println(name.getPublicName());
        System.out.println(name.getFullName());
        System.out.println(name.getFirstName());
    }

}