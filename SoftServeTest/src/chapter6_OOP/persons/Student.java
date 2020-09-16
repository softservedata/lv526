package chapter6_OOP.persons;

import chapter6_OOP.persons.Person;

public class Student extends Person {
    final String TYPE_PERSON = "Student";
    @Override
    public void print() {
        System.out.println(" I am a ... ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
