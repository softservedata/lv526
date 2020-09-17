package com.softserve.edu7.Practical.task_with_person;

public class Student extends Person{
final String TYPE_PERSON = "Student";


    @Override
    void print() {
        System.out.println("Im a ...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
