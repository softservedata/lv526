package com.softserve.edu04;

public class Employee {
	
	private String name;
	private int rate;
	private int hours;
	
	static int totalSum;

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Ostap", 100, 20);
		Employee employee2 = new Employee("Kateryna", 500, 10);
		Employee employee3 = new Employee("Halyna", 350, 30);
		
		System.out.println(totalSum);
		
	}	
	public Employee() {
		name = null;
		rate = 0;
		hours = 0;
		totalSum = totalSum + getSalary();
	};
	
	public Employee (String name, int rate) {
		this.name = name;
		this.rate = rate;
		totalSum = totalSum + getSalary();
	}
	
	public Employee (String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + getSalary();
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
	
	
	public int getSalary() {
		return  rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public void changeRate (int rate) {
		this.rate = rate;
	}
	
	public double getBonuses() {
		return getSalary() * 0.1;
	}
		
		
	}
	
	
