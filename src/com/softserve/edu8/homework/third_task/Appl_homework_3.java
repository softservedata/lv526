package com.softserve.edu8.homework.third_task;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Appl_homework_3 {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Ivan",5));
        studentList.add(new Student("Sergiy",4));
        studentList.add(new Student("Rostislav",3));
        studentList.add(new Student("Oleg",5));

        Student student = new Student();
        student.printStudents(studentList,5);
        Iterator <Student> iter = studentList.iterator();


    }
}
