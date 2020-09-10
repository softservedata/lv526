package com.softserve.edu04;

public class Student {
	private String name;
	private double rating;
	private static double sumRating;
	private static double count;
		
	public Student() {
		name = "";
		rating = 0;
		sumRating = sumRating + rating;
		count++;
	}
	
	public Student(String name, double rating) {
		this.name = name;
		this.rating = rating;
		sumRating = sumRating + rating;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public static double avgRating() {
		return sumRating / count;
	}

	public Student betterStudent(Student otherStudent) {
		return getRating() >= otherStudent.getRating() ? this : otherStudent;
	}
	
	@Override
	public String toString() {
		return "Student [" + "name = " + name 
				+ ", rating= " + rating 
				+ "]";
	}
	
}
