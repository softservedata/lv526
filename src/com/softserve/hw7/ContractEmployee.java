package com.softserve.hw7;

public class ContractEmployee extends Employee {

	public ContractEmployee(String federalTaxIdmember, String name, int fixed_monthly_payment) {
		super();
		this.federalTaxIdmember = federalTaxIdmember;
		this.name = name;
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	private String federalTaxIdmember;
	private String name;
	private int salary;
	private int fixed_monthly_payment;

	@Override
	public void calculatePay() {
		salary = fixed_monthly_payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFixed_monthly_payment() {
		return fixed_monthly_payment;
	}

	public void setFixed_monthly_payment(int fixed_monthly_payment) {
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

}