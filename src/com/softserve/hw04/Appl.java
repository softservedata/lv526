package com.softserve.hw04;

import java.io.BufferedReader;
import java.util.Scanner;

public class Appl {
    
    /*-
    public static void main(String[] args) {
        String currentName;
        double currentRating;
        //BufferedReader b;
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("Student 1. name = ");
        currentName = scanner.nextLine();
        System.out.print("Student 1. rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        Student stud1 = new Student(currentName, currentRating);
        //
        Student stud2 = new Student();
        System.out.print("Student 2. name = ");
        currentName = scanner.nextLine();
        System.out.print("Student 2. rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        //Student stud2 = new Student();
        stud2.setName(currentName);
        stud2.setRating(currentRating);
        //
        Student stud3 = new Student(stud2);
        System.out.print("Student 3. name = ");
        currentName = scanner.nextLine();
        stud3.setName(currentName);
        //
        // Betters Student
        Student betterStudent = stud1.betterStudent(stud2);
        betterStudent = betterStudent.betterStudent(stud3);
        System.out.println("betterStudent = " + betterStudent);
        //
        System.out.println("avgRating = " + Student.avgRating());
        //
        System.out.println("stud1 = " + stud1);
        System.out.println("stud2 = " + stud2);
        System.out.println("stud3 = " + stud3);
        //
        scanner.close();
    }
    */

    public static void main(String[] args) {
        System.out.println("Input Student 1.");
        Student stud1 = Student.readFromKeyboard();
        //
        System.out.println("Input Student 2.");
        Student stud2 = Student.readFromKeyboard();
        //
        System.out.println("Input Student 3.");
        Student stud3 = Student.readFromKeyboard();
        //
        // Betters Student
        Student betterStudent = stud1.betterStudent(stud2);
        betterStudent = betterStudent.betterStudent(stud3);
        System.out.println("betterStudent = " + betterStudent);
        //
        System.out.println("avgRating = " + Student.avgRating());
        //
        System.out.println("stud1 = " + stud1);
        System.out.println("stud2 = " + stud2);
        System.out.println("stud3 = " + stud3);
        //
        Student.closeScanner();
    }
}
