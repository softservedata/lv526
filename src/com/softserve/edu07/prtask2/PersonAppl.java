package com.softserve.edu07.prtask2;

public class PersonAppl {

	public static void main(String[] args) {
	
		Person[] persons = {
				new Student(),
				new Teacher(),
				new Cleaner(),
				new Student()
		};
		
		for (Person i:persons) {
			i.print();
			if (i instanceof Staff){
				System.out.println("Salry is " + ((Staff) i).salary());
			}
		}
	}	
}
