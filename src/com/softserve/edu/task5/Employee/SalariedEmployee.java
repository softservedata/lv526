package com.softserve.edu.task5.Employee;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private double salary;
    private double rate;
    private double hours;
    private String name;

    public SalariedEmployee(int employeeld) {
        super(employeeld);
        this.name = "Ahmed";
        this.socialSecurityNumber = "142-26-515";
        this.salary = 0;
        this.rate = 149;
        this.hours = 10;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + " Employee ld: " + this.getEmployeeld()+
                " socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public double calculatePay() {
//        System.out.println("SalariedEmployee salary: " + (rate * hours)
//                + " Employee ld: " + this.getEmployeeld()
//                + " Security Number: " + socialSecurityNumber + " Name " + name);
//        System.out.println(toString() + (this.salary = rate * hours));
        this.salary = rate * hours;
        return this.salary;
    }
}
