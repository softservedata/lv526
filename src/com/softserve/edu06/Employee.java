package com.softserve.edu06;

import java.util.Scanner;

public class Employee {

	private String name;
	private int departementNumber;
	private double salary;
	
	public Employee() {}
	
	public Employee (String name,int departementNumber, double salary) {
		this.name = name;
		this.departementNumber = departementNumber;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}

	public int getDepartementNumber() {
		return departementNumber;
	}

	public double getSalary() {
		return salary;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartementNumber(int departementNumber) {
		this.departementNumber = departementNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name 
				+ ", departementNumber=" + departementNumber 
				+ ", salary=" + salary 
				+ "]";
	}

	public static void depEmployee(Employee[] employees) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter department number");
		int dep = Integer.parseInt(scan.nextLine());
		for (Employee i:employees) {
			if (dep == i.getDepartementNumber()) {
				System.out.println(i.toString());
			} 	
			
		}
		scan.close();
	}
	
	public static void sortingBySalary(Employee[] employees) {
		for (int i = 0; i<employees.length-1; i++) {
			for (int j= 0; j<employees.length-1-i; j++) {
				if(employees[j].getSalary()<employees[j+1].getSalary()){
				double temp = employees[j].getSalary();
				employees[j].setSalary(employees[j+1].getSalary());
				employees[j+1].setSalary(temp);
				}
			}
		}
	
		System.out.println("Sorting by salary:");
	for(Employee i : employees) {
		System.out.println(i.toString());
	}
	
	}
}
