package com.softserve.edu07.homework2;

public class Employee implements Calculate{

	private String employeeId;
	
	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	@Override
	public double calculatePay() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + "]";
	}
	
	
	
	
}
