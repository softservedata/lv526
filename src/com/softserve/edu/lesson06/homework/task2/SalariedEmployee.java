package com.softserve.edu.lesson06.homework.task2;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay(int salary) {
		System.out.println("SalariedEmployee calcpay");
		return salary;
	}

}
