package com.softserve.edu.lesson06.homework.task2;

public class Employee implements Calc {

	private String employeeld;

	public Employee() {
		employeeld = null;
	}

	public Employee(String employeeld, int salary) {
		this.employeeld = employeeld;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + "]";
	}

	@Override
	public int calculatePay(int perHour) {
		int salary;
		salary = 0;
		return salary;
	}

	@Override
	public int getSalary() {
		return 0;
	}

}
