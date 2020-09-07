package com.softserve.edu.lesson05.practicaltask;

import java.util.Scanner;

public class ApplEmployee {
	public static void main(String[] args) {
		Employ[] employees = new Employ[5];

		System.out.println("input information about employe");
		for (int i = 0; i < employees.length; i++) {
			employees[i] = Employ.readFromKeyboard();
		}

		System.out.println("Enter department number");
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		a = scanner.nextInt();
		scanner.close();

		System.out.println("in " + a + " department works : ");
		for (int i = 0; i < employees.length; i++) {
			b = employees[i].getDepartmentNumber();
			if (b == a) {
				System.out.println(employees[i].getName());
			}
		}

		for (int l = 0; l < employees.length; l++) {
			for (int i = 1; i < employees.length; i++) {
				if (employees[i].getSalary() > employees[i - 1].getSalary()) {
					employees[i].swap(employees, i, (i - 1));
				}
			}
		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}

	}

//	public static void swap(Employ[] employee, int i, int max) {
//		String tmpName;
//		int tmpDep;
//		int tmpSalary;
//		tmpName = employee[i].getName();
//		tmpDep = employee[i].getDepartmentNumber();
//		tmpSalary = employee[i].getSalary();
//
//		employee[i].setName(employee[max].getName());
//		employee[i].setDepartmentNumber(employee[max].getDepartmentNumber());
//		employee[i].setSalary(employee[max].getSalary());
//
//		employee[max].setName(tmpName);
//		employee[max].setDepartmentNumber(tmpDep);
//		employee[max].setSalary(tmpSalary);
//	}
}