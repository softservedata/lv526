package com.softserve.hw7;

public class SalariedEmployee extends Employee {
	public SalariedEmployee(String name, String socialSecurityNumber, int hourly_rate, int hours_worked) {
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourly_rate = hourly_rate;
		this.hours_worked = hours_worked;
	}

	private String name;
	private String socialSecurityNumber;
	private int salary;
	private int hourly_rate;
	private int hours_worked;

//salary = hourly rate * number of hours worked
	@Override
	public void calculatePay() {
		// TODO Auto-generated method stub
		salary = hourly_rate * hours_worked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(int hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}
}