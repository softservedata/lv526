package com.softserve.hw4;

public class Employee {
	
	private String name;
	private int rate ;
	private int hours;
	private static int totalSum;
	
	Employee(){
	
	name = "note";
	rate = 1000;
	hours = 8;
	}
	
	Employee(String name, int rate) {
		
		this.name = name;
		this.rate = rate;
		
	}
	
	Employee(String name, int rate, int hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public void getSalary (){
		
	System.out.println("salary " + (rate*hours));
	}
	
	public void changeRate(int rate) {
	
		this.rate = rate;
		System.out.println(" new salary " + (rate*hours));
	}
	
	public void getBonuses() {
		
	System.out.println("10% from salary " + ((rate*hours))/10);
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}


}
