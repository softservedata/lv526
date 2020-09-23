package com.softserve.edu.lesson06.practicaltask.task2;

public class Appl {

	private static void sal(Person person) {
		if (person instanceof Staff) {
			((Staff) person).salary();
		}
	}

	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Teacher();
		person[1] = new Teacher();
		person[2] = new Cleaner();
		person[3] = new Student();
		person[4] = new Cleaner();
		person[5] = new Student();

		for (Person pers : person) {
			pers.print();
			sal(pers);
			System.out.println("\n");
		}
	}
}
