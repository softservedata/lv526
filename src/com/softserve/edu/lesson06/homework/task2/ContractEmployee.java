package com.softserve.edu.lesson06.homework.task2;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	private int salary;

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public int calculatePay(int perHour) {
		System.out.println("ContractEmployee calcpay");
		this.salary = 8 * perHour;
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
