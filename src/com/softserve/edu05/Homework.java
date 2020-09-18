package com.softserve.edu05;

public class Homework {

	public static void main(String[] args) {
		
		MinMax intNumber = new MinMax();
		
		intNumber.input();
		intNumber.min();
		intNumber.max();

		Dog d1 = new Dog("Oscar", "bulldog", 2);
		Dog d2 = new Dog("Dexter", "terrier", 4);
		Dog d3 = new Dog("Bella", "dulmatian", 1);
		
		
		if (d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName()) 
		|| d2.getName().equals(d3.getName())){
			System.out.println("There are dogs with the same names");
		} else {
			System.out.println("All dogs have different names");
		}
		
		
		if (d1.getAge()>d2.getAge() && d1.getAge()>d3.getAge()) {
			System.out.println("The oldest dogs name and kind are: " + d1.getName() + ", " + d1.getBreed());
		} else if (d2.getAge()>d1.getAge() && d2.getAge()>d3.getAge()) {
			System.out.println("The oldest dogs name and kind are: " + d2.getName() + ", " +  d2.getBreed());
		} else {
			System.out.println("The oldest dogs name and kind are: " + d3.getName() + ", " +  d3.getBreed());
		}
		
		
	}

}
