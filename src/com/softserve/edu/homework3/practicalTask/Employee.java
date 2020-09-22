package com.softserve.edu.homework3.practicalTask;

public class Employee {
	private String name;
	private double rate;
	private double hours;
	static double totalSum = 0;

public Employee(){
	
}
public Employee(String name, double rate){
	this.name = name;
	this.rate = rate;
}
public Employee(String name, double rate,double hours){
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
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public double getHours() {
	return hours;
}
public void setHours(double hours) {
	this.hours = hours;
}
public String toString() {
	return "Employee name=" + name + ", rate=" + rate + ", hours=" + hours + "";
}
public void getBonuses() {
	double bonus = (rate * hours)* 0.1;
    System.out.println("Bonus = " + bonus);
}
public void getSalary(){
    double salary = rate * hours;
   
    double bonus;
    bonus = (rate * hours)* 0.1;
    totalSum = salary+bonus;
    
    System.out.println("Salary with bonus = " + totalSum);
}

public void changeRate (double rate) {
	this.rate = rate;
}
public static double getTotalSum() {
    return totalSum; 
}
}
