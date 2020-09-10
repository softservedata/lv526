package com.softserve.edu04;

import java.util.Scanner;

public class ApplStudent {
	public static void main(String [] args) {
		String currentName;
		double currentRating;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Student 1 name = ");
        currentName = scanner.nextLine();
        System.out.print("Student 1 rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        Student stud1 = new Student(currentName, currentRating);
        //
        System.out.print("Student 2 name = ");
        currentName = scanner.nextLine();
        System.out.print("Student 2 rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        Student stud2 = new Student(currentName, currentRating);
        //
		System.out.print("Student 3 name = ");
        currentName = scanner.nextLine();
        System.out.print("Student 3 rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        Student stud3 = new Student(currentName, currentRating);
        //
        Student betterStudent = stud1.betterStudent(stud2);
        betterStudent = betterStudent.betterStudent(stud3);
        System.out.println("betterStudent = " + betterStudent);
        //
        System.out.println("avgRating = " + Student.avgRating());
        //
        System.out.println("stud 1 " + stud1);
        System.out.println("stud 2 " + stud2);
        System.out.println("stud 3 " + stud3);
        
        scanner.close();
	}
}