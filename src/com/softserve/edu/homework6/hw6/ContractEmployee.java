package com.softserve.edu.homework6.hw6;

public class ContractEmployee extends Employee implements infoPay {
	private String employeeld;
	private String name;
	private double tarif;
	private double hours;
	private int federalTaxIdmember;

	public ContractEmployee() {
		employeeld = "25";
		name = "Vasyl";
		tarif = 52.5;
		hours = 140;
		federalTaxIdmember = 45372937;

	}
	public ContractEmployee(String id, String name, double tarif, double hours, int federalTaxIdmember) {
		this.employeeld = id;
		this.name = name;
		this.tarif = tarif;
		this.hours = hours;
		this.federalTaxIdmember = federalTaxIdmember;
	}
	@Override
	public void calculatePay() {
		System.out.println("Contract Employee: \n Id = "+ employeeld 
				+ ",\n Name = " + name 
				+ ",\n salry = " + (tarif*hours)
				+ ",\n tarif = " + tarif 
				+ ",\n hours = " + hours
				+ ",\n Federal Tax Id member = " 
				+ federalTaxIdmember + ";\n");
	}
	
}