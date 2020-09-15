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
		employee[0].setName("Kolia");
		employee[0].setSalary(12436);

		employee[1].setEmployeeld("2");
		employee[1].setName("Nadia");
		employee[1].setSalary(125);
		employee[1].setHour(15);

		employee[2].setEmployeeld("3");
		employee[2].setName("Mikola");
		employee[2].setSalary(14000);

		employee[3].setEmployeeld("4");
		employee[3].setName("Lesia");
		employee[3].setSalary(100);
		employee[3].setHour(20);

		for (int i = 0; i < employee.length; i++) {
			System.out.println("Salary " + employee[i].getEmployeeld() + " - "
					+ employee[i].calculatePay(employee[i].getSalary()));
		}

		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = 0; j < ((employee.length - i) - 1); j++) {
				if (employee[j].getSalary() < employee[j + 1].getSalary()) {
					emp = employee[j];
					employee[j] = employee[j + 1];
					employee[j + 1] = emp;
				}
			}
		}

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());

		}
	}
}
