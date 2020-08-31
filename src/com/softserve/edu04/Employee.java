package com.softserve.edu04;

public class Employee {
	
	private String name;
	private int rate;
	private int hours;
	
	private static int totalSum;

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("Ostap");
		employee1.setRate(100);
		employee1.setHours(20);
		Employee employee2 = new Employee("Kateryna", 500);
		employee2.setHours(10);
		Employee employee3 = new Employee("Halyna", 350, 30);
		
		totalSum = employee1.getSalary()+employee2.getSalary()+employee3.getSalary();
		
		System.out.println(totalSum);
		
	}	
	public Employee() {
		this.name = "Olga";
		this.rate = 800;
		this.hours = 50;
		
	};
	
	public Employee (String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee (String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
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
		return totalSum;
	}
	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
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
	
	
