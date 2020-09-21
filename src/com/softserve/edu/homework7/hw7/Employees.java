package com.softserve.edu.homework7.hw7;

public class Employees {

	public static void main(String[] args) {

		Employee[] employeeId = { 
				new ContractEmployee(),
				new SalariedEmployee() };
	
		

		for (int i = 0; i < employeeId.length; i++) {
			employeeId[i].calculatePay();
				
		}
	}
}