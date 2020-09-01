package com.softserve.edu.lesson03;

public class Student {
	private String name;
	private int rating;
	
	static double totalRating=0;
	static int i=0;

	
	public boolean betterStudent(Student st1, Student st2) {
		return (st1.rating>st2.rating);
	}
	
	public double avgRating() {
		return (totalRating/i);
	}
	public Student() {
	
	}

	public Student(String name, int rating) {
		totalRating +=rating;
		i++;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
}
