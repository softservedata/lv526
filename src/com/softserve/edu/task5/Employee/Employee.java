package com.softserve.edu.task5.Employee;

interface EmployeeCalc {

    public abstract double calculatePay();
}

public abstract class Employee implements EmployeeCalc {
    private int employeeld;

    public int getEmployeeld() {
        return employeeld;
    }

    public Employee(int employeeld) {
        this.employeeld = employeeld;
    }
}
