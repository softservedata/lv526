package com.softserve.edu06;

public class Employee {
    private String name;
    private int department_num;
    private int salary;


    public Employee(String name,int department_num,int salary) {
        this.name =name;
        this.department_num= department_num;
        this.salary=salary;
    }


    public int getSalary() {
        return salary;
    }


    public String toString(){
        return "(Emloyee "+ name +", "+department_num+", "+salary+")";
    }
}
