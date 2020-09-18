package com.softserve.edu07.homework2;

public class SalariedEmployee extends Employee{

	private String socialSecurityNumber;
	private double monthlyRate;
	
	public SalariedEmployee(String employeeId, String socialSecurityNumber, double monthlyRate) {
		super(employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.monthlyRate = monthlyRate;
	}
	
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getMonthlyRate() {
		return monthlyRate;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [EmployeeId=" + super.getEmployeeId()
				+ ", socialSecurityNumber=" + socialSecurityNumber
				+ ", monthlyRate=" + monthlyRate
				+ "]";
	}

	@Override
	public double calculatePay() {
		return monthlyRate;
	}
	

}
