package com.softserve.edu15;

import java.util.Comparator;

public class Person { // Comparable
    
    // Java 7 Style
    public static class CompareByName implements Comparator<Person> {
        @Override
        public int compare(Person p0, Person p1) {
            return p0.name.compareTo(p1.name);
        }
    }
    
    public static class CompareByAge implements Comparator<Person> {
        @Override
        public int compare(Person p0, Person p1) {
            return p0.age - p1.age;
        }
    }
    
    private String name;
    private Integer age;
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public static int compareByAge(Person p0, Person p1) {
        return p0.name.compareTo(p1.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name +
                ", age=" + age
                + "]";
    }

}
