package com.softserve.edu.task5.Employee;

public class EmployeeProgram {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee(1),
                new ContractEmployee(2)
        };

        for(int i = 0; i < employees.length; i++){
//            System.out.println(employees[i].calculatePay());
            employees[i].calculatePay();
            System.out.println(employees[i].toString());
        }
    }
}
