package com.softserve.edu.homework7.hw7;

public class SalariedEmployee extends Employee implements infoPay {
	private String employeeld;
	private String name;
	private int securityNumber;
	private double fixedSalry;
	
	
	public SalariedEmployee() {
		employeeld = "23";
		name = "Petro";
		fixedSalry = 5000;
		securityNumber = 675639274;
		
	}

		public SalariedEmployee(String id, String name, double fixedSalry, int securityNumber) {
		this.employeeld = id;
		this.name = name;
		this.fixedSalry = fixedSalry;
		this.securityNumber = securityNumber;
	}	
		@Override
		public void calculatePay() {
			System.out.println("Salaried Employee: \nId = " + employeeld 
			   + ",\n Name = " + name 
		       + ",\n Fixed Salry = " + fixedSalry 
		       + ",\n Security Number = "
		       + securityNumber + ";");
		}
}
