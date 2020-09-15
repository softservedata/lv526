package com.softserve.edu.lesson06.practicaltask.task2;

public class Appl {
	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Teacher();
		person[1] = new Teacher();
		person[2] = new Cleaner();
		person[3] = new Student();
		person[4] = new Cleaner();
		person[5] = new Student();

		for (int i = 0; i < person.length; i++) {
			person[i].print();
			String type = person[i].getTYPE_PERSON();
			if ((type.equals("Teacher")) || (type.equals("Cleaner"))) {
				person[i].salary();
			}
			System.out.println("\n");
		}
	}
}
