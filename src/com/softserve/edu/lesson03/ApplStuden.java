package com.softserve.edu.lesson03;

public class ApplStuden {
	
	public static void main(String[] args) {
	Student st1 = new Student("Petro",124);
	Student st2 = new Student("Mykola",187);
	Student st3 = new Student("Oleh",192);
	
	System.out.println(st1.betterStudent(st1,st2));
	System.out.println(st1.toString());
	System.out.println("avg rating: " + st1.avgRating());
	System.out.println("Total rating: " + Student.totalRating);
	
	}	
}
