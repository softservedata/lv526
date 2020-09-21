package com.softserve.hw07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Stepan", 2));
        students.add(new Student("Petro", 3));
        students.add(new Student("Petro", 1));
        students.add(new Student("Petro", 4));
        students.add(new Student("Ira", 3));
        students.add(new Student("Ivan", 5));
        //
        System.out.println("Original List:");
        Student.printStudents(students);
        //
        Collections.sort(students, new Student.ByName());
        System.out.println("\nSorted by name:");
        Student.printStudents(students);
        //
        Collections.sort(students, new Student.ByCourse());
        System.out.println("\nSorted by couse:");
        Student.printStudents(students);
    }
}
