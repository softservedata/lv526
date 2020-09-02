package com.softserve.edu.homework4;

public class People {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setFirstName("Dmytro");
		p1.setLastName("Daniv");
		p1.setBirthYear (1987);
		p1.getOutput();
		p1.getAge();
		System.out.println();		
		
		Person p2 = new Person("Ivan", "Tokar", 1977);
		p2.getOutput();
		p2.getAge();
		System.out.println();
		
		Person p3 = new Person("Vasyl", "Teteruk", 1990);
		p3.getOutput();
		p3.getAge();
		System.out.println();
		
		Person p4 = new Person("Petro", "Stupka", 1993);
		p4.getOutput();
		p4.getAge();
		System.out.println();
		
		System.out.println();
		Person p5 = new Person("Igor", "Demko", 1986);
		p5.getOutput();
		p5.getAge();
		
	}

}
