package com.softserve.edu.task5.Employee;

public class ContractEmployee extends Employee {
    private String federalTaxIdmember;
    private double monthlyPay;
    private String name;
    private double salary;

    public ContractEmployee(int employeeld) {
        super(employeeld);
        this.name = "Ivan";
        this.salary = 0;
        this.federalTaxIdmember = "123-233-1234";
        this.monthlyPay = 2101;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double calculatePay() {
//        System.out.println("ContractEmployee salary: " + monthlyPay
//                + " Employee ld: " + this.getEmployeeld()
//                + " Federal Tax Id: " + federalTaxIdmember + " Name " + name);
//        System.out.println(toString());
        this.salary = monthlyPay;
        return this.salary;
    }
}
