package com.softserve.hw07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ApplUnion {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        /*-
        Set<String> set1 = new HashSet<>();
        set1.add("Ivan");
        set1.add("Petro");
        set1.add("Stepan");
        set1.add("Ira");
        System.out.println("set1: " + set1);
        //
        Set<String> set2 = new HashSet<>();
        set2.add("Ivan");
        set2.add("Oksana");
        set2.add("Andriy");
        set2.add("Ira");
        //set2.add("Stepan");
        System.out.println("set2: " + set2);
        //
        System.out.println("union: " + union(set1, set2));
        System.out.println("intersect: " + intersect(set1, set2));
        */
        //
        //Set<Student> set1 = new HashSet<>();
        //Set<Student> set1 = new TreeSet<>();
        Set<Student> set1 = new TreeSet<>(new Student.ByNameCourse());
        set1.add(new Student("Stepan", 2));
        set1.add(new Student("Petro", 3));
        set1.add(new Student("Petro", 1));
        set1.add(new Student("Petro", 4));
        set1.add(new Student("Ira", 3));
        set1.add(new Student("Ivan", 5));
        System.out.println("set1: " + set1);
        //
        //Set<Student> set2 = new HashSet<>();
        //Set<Student> set2 = new TreeSet<>();
        Set<Student> set2 = new TreeSet<>(new Student.ByNameCourse());
        set2.add(new Student("Stepan", 5));
        set2.add(new Student("Petro", 3));
        set2.add(new Student("Petro", 5));
        set2.add(new Student("Petro", 4));
        set2.add(new Student("Ira", 3));
        set2.add(new Student("Ivan", 5));
        System.out.println("set2: " + set2);
        //
        System.out.println("union: " + union(set1, set2));
        System.out.println("intersect: " + intersect(set1, set2));
 
    }
}
