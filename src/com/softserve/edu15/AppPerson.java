package com.softserve.edu15;

import java.util.Arrays;
import java.util.Comparator;

public class AppPerson {
    public static void main(String[] args) {
        Person[] persons = { new Person("Ivan", 34), new Person("Vasyl", 29), new Person("Olga", 26),
                new Person("Anna", 41) };
        System.out.println("Origin: " + Arrays.toString(persons));
        /*-
        Arrays.sort(persons, new Person.CompareByName());
        //
        Arrays.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        */
        //Arrays.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());
        Arrays.sort(persons, Person::compareByAge);
        //
        System.out.println("Updated: " + Arrays.toString(persons));

    }
}
