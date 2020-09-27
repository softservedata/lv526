package com.softserve.edu.homework7.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Students {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		    students.add(new Student("Taras", 4));
	        students.add(new Student("Bohdan", 5));
	        students.add(new Student("Ivan", 2));
	        students.add(new Student("Roman", 3));	        
	        students.add(new Student("Oleg", 1));
	        students.add(new Student("Andrii", 3));
	       
	        System.out.println("Original List:");
	        Student.printStudents(students);
	        
	        Collections.sort(students, new Student.ByName());
	        System.out.println("\nSorted by name:");
	        Student.printStudents(students);
	        
	        Collections.sort(students, new Student.ByCourse());
	        System.out.println("\nSorted by couse:");
	        Student.printStudents(students);
	    }
	}
