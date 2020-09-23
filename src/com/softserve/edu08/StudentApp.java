package com.softserve.edu08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Khrystyna", 1));
		students.add(new Student("Olga", 3));
		students.add(new Student("Orest", 1));
		students.add(new Student("Kyrylo", 2));
		students.add(new Student("Karina", 3));
		
		Collections.sort(students);
		
		System.out.println("\tStudents ordered by name:");
		Iterator<Student> i = students.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
		}

		Collections.sort(students, new Student.SortByCourse());
		
		System.out.println("\tStudents ordered by course:");
		Iterator<Student> i1 = students.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
			}
		
		System.out.println();
		Student.printStudentsByCourse(students, 1);
	}

}
