package com.softserve.edu07.homework2;

public class EmployeeApp {

	public static void sortBySalaryDesc(Employee[] employees) {
		for (int i = 0; i<employees.length - 1; i++) {
			for (int j= 0; j<employees.length - 1- i; j++) {
				if (employees[j].calculatePay()<employees[j+1].calculatePay()) {
					Employee temp = employees[j];
					employees[j] = employees[j+1];
					employees[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
		Employee[] employees = {
				new SalariedEmployee("01", "37585959", 5000),
				new ContractEmployee("02", 300, 20, "689483736"),
				new SalariedEmployee("03", "76849399", 10000),
				new ContractEmployee("04", 500, 400, "10484476")
				
		};
		
		EmployeeApp.sortBySalaryDesc(employees);
		
		for(Employee i:employees) {
			System.out.println(i.toString() + " " + "salary = "+ i.calculatePay());
		}
		
	}

}
