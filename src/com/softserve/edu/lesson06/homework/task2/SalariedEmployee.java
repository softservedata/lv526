package com.softserve.edu.lesson06.homework.task2;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;
	private int salary;

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay(int salary) {
		System.out.println("SalariedEmployee calcpay");
		this.salary = salary;
		return salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
