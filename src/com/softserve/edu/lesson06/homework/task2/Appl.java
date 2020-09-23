package com.softserve.edu.lesson06.homework.task2;

public class Appl {

	public static void main(String[] args) {
		Employee[] employee = new Employee[4];
		Employee emp = null;

		employee[0] = new SalariedEmployee();
		employee[1] = new ContractEmployee();
		employee[2] = new SalariedEmployee();
		employee[3] = new ContractEmployee();

		employee[0].setEmployeeld("1");
		employee[1].setEmployeeld("2");
		employee[2].setEmployeeld("3");
		employee[3].setEmployeeld("4");
		int k = 3;
		for (Employee employees : employee) {
			System.out.println("Salary " + employees.getEmployeeld() + " - " + employees.calculatePay((1000 * k)));
			k += 1;
		}

		sort(employee, emp);

		System.out.println("\n\n");
		for (Employee employees : employee) {
			System.out.println("Salary " + employees.getEmployeeld() + " - " + employees.getSalary());
		}

	}

	private static void sort(Employee[] employee, Employee emp) {
		for (int i = 0; i < employee.length; i++)
			for (int j = 0; j < (employee.length - i) - 1; j++) {
				if (employee[j].getSalary() > employee[j + 1].getSalary()) {
					emp = employee[j];
					employee[j] = employee[j + 1];
					employee[j + 1] = emp;
				}

			}
	}
}