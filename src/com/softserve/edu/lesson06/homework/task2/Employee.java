package com.softserve.edu.lesson06.homework.task2;

public class Employee implements Calc {

	private String employeeld;
	private int salary;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		employeeld = null;
		salary = 0;
	}

	public Employee(String employeeld, int salary) {
		this.employeeld = employeeld;
		this.salary = salary;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + " name = " + name + ", salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int calculatePay(int salary) {
		return salary;
	}

	@Override
	public void setHour(int hour) {
		// TODO Auto-generated method stub

	}

}
