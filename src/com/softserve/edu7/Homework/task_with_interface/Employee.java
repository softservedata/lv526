package com.softserve.edu7.Homework.task_with_interface;

public class Employee {
    private  String employeeld ;

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }
}
