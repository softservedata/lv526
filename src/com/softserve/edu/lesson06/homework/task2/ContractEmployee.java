package com.softserve.edu.lesson06.homework.task2;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	private int hour;

	public int getHour() {
		return hour;
	}

	@Override
	public void setHour(int hour) {
		this.hour = hour;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public int calculatePay(int salary) {
		System.out.println("ContractEmployee calcpay");
		super.setSalary(salary * hour);
		return salary * hour;

	}
}
