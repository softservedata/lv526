package com.softserve.hw04;

import java.util.Scanner;

public class Student {
    private String name; // null by default
    private double rating; // = 0
    private static double sumRating;
    private static int count;
    private static Scanner scanner;

    static {
        sumRating = 0.0;
        count = 0;
        scanner = null;
        System.out.println("static block done");
    }

    public Student() {
        name = "";
        rating = 0.0;
        sumRating = sumRating + rating;
        count++;
        System.out.println("default constructor done");
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        sumRating = sumRating + rating;
        count++;
        System.out.println("constructor with parameters done");
    }

    public Student(Student student) {
        name = student.getName();
        rating = student.getRating();
        sumRating = sumRating + rating;
        count++;
        System.out.println("constructor of copy done");
    }

    public static Student readFromKeyboard() { // Static factory
        String currentName;
        double currentRating;
        //
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        //
        System.out.print("Student name = ");
        currentName = scanner.nextLine();
        System.out.print("Student rating = ");
        currentRating = scanner.nextDouble();
        scanner.nextLine();
        return new Student(currentName, currentRating);
    }

    public static void closeScanner() {
        if (scanner != null) {
            scanner.close();
            scanner = null;
        }
    }

    public static double avgRating() {
        return sumRating / count;
    }

    public Student betterStudent(Student otherStudent) {
        return getRating() >= otherStudent.getRating() ? this : otherStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        // code
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student [" + " name=" + name + ", rating=" + rating + "]";
    }

}
