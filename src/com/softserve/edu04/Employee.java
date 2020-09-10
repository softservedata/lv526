package com.softserve.edu04;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static int totalSum;
	private static int count;
	
	public Employee() {
		name = "";
		rate = 0;
		hours = 0;
		count++;
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		count++;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static int getTotalSum() {
		return totalSum*count;
	}

	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}
	
	public int getSalary() {
		return rate*hours;
	}

	@Override
	public String toString() {
		return "Employee [" + "name = " + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public int getBonuses() {
		return getSalary()/100*10;
	}
	
}
