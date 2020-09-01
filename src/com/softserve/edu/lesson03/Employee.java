package com.softserve.edu.lesson03;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	static int totalSum=0;
	
	public int getSalary() {
		return (rate*hours);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}


	public int changeRate(int rate) {
		totalSum -= this.rate*hours;
		this.rate=rate;
		totalSum += this.rate*hours;
		return getSalary();
	}
	
	public double getBonuses() {
		return (getSalary()*0.1);
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum+=(rate*hours);		
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee() {
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
}
