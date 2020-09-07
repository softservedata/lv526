package com.softserve.edu.lesson05.practicaltask;

import java.util.Scanner;

public class Employ {
	private String name;
	private int departmentNumber;
	private int salary;

	private static Scanner scanner;

	static {
		scanner = null;
	}

	private Employ() {
		name = "";
		departmentNumber = 0;
		salary = 0;
	}

	private Employ(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public static Employ readFromKeyboard() {
		String name;
		int departmentNumber;
		int salary;
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		System.out.print("Enter name - ");
		name = scanner.nextLine();
		System.out.print("Enter department number - ");
		departmentNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter salary - ");
		salary = scanner.nextInt();
		scanner.nextLine();
		return new Employ(name, departmentNumber, salary);
	}

	public void closeScanner() {
		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
	}

	public void swap(Employ[] employee, int i, int max) {
		String tmpName;
		int tmpDep;
		int tmpSalary;
		tmpName = employee[i].getName();
		tmpDep = employee[i].getDepartmentNumber();
		tmpSalary = employee[i].getSalary();

		employee[i].setName(employee[max].getName());
		employee[i].setDepartmentNumber(employee[max].getDepartmentNumber());
		employee[i].setSalary(employee[max].getSalary());

		employee[max].setName(tmpName);
		employee[max].setDepartmentNumber(tmpDep);
		employee[max].setSalary(tmpSalary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

}
