package com.softserve.edu06;

import java.util.Scanner;

public class EmployeeAppl {

	public static void main(String[] args) {
		Employee[] employees = {
		new Employee("Anna", 3, 200),
		new Employee("Olena", 1, 5000),
		new Employee("Oleg", 2, 370),
		new Employee("Pavlo", 2, 2000),
		new Employee("Artem", 4, 700)};
	
		Employee.depEmployee(employees);
		
		Employee.sortingBySalary(employees);
		
			
		
	}

}

