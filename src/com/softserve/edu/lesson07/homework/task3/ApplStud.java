package com.softserve.edu.lesson07.homework.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ApplStud {

	private static int Scanner() {
		Scanner scanner = new Scanner(System.in);
		int course = scanner.nextInt();
		scanner.close();
		scanner = null;
		return course;
	}

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Kolia", 1));
		studentList.add(new Student("Lesia", 3));
		studentList.add(new Student("Wiwi", 2));
		studentList.add(new Student("Natalia", 4));
		studentList.add(new Student("Olia", 3));
		studentList.add(new Student("Valera", 1));
		studentList.add(new Student("Ania", 3));
		studentList.add(new Student("Olena", 2));
		studentList.add(new Student("Oksana", 4));
		studentList.add(new Student("Chris", 3));

		System.out.println("Origin list\n");
		Student.printStudents(studentList);
		//
		System.out.println("Enter course number, for print stutents from course");
		int course = Scanner();
		Student.printStudentsByCourse(studentList, course);
		//
		System.out.println("\nSorted by Name\n");
		Collections.sort(studentList, new Student.ByName());
		Student.printStudents(studentList);
		//
		System.out.println("\nSorted by course\n");
		Collections.sort(studentList, new Student.ByCourse());
		Student.printStudents(studentList);
	}
}
