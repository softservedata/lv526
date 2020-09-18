package com.softserve.edu07.homework2;

public class ContractEmployee extends Employee{

	private double hourlyRate;
	private int workedHours;
	private String federalTaxIdmember;
	
	public ContractEmployee(String employeeId, double hourlyRate, int workedHours, String federalTaxIdmember) {
		super(employeeId);
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
		this.federalTaxIdmember = federalTaxIdmember;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}


	@Override
	public String toString() {
		return "ContractEmployee [EmployeeId=" + super.getEmployeeId()
				+ ", hourlyRate=" + hourlyRate 
				+ ", workedHours=" + workedHours 
				+ ", federalTaxIdmember=" + federalTaxIdmember
				+ "]";
	}

	@Override
	public double calculatePay() {
		return hourlyRate*workedHours;
	}
	}

	

