package chapter7_Collections.homework3FROMCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStarter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nazar", 2));
        students.add(new Student("Olena", 1));
        students.add(new Student("Vlad", 3));
        students.add(new Student("Ostep", 5));
        students.add(new Student("Yarema", 6));
        students.add(new Student("Anita", 3));
        System.out.println("Original list : ");
        Student.printStudents(students);
        Collections.sort(students , new Student.ByName());
        System.out.println("Sorted by name :");
        Student.printStudents(students);
        System.out.println("Sorted by course :");
        Collections.sort(students , new Student.ByCourse());
        Student.printStudents(students);


    }
}
