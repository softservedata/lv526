package com.softserve.edu.homework4;

public class Staff {

	public static void main(String[] args) {
					
		Employee employee1 = new Employee("Leonardo", 65.5, 164);
		System.out.println(employee1.toString());
		employee1.changeRate(65.5); 
		employee1.getBonuses();
		employee1.getSalary();
		System.out.println(); 
		
		Employee employee2 = new Employee("Dario", 64.5, 172);
		System.out.println(employee2.toString());
		employee2.changeRate(64.5);
		employee2.getBonuses();
		employee2.getSalary();
		System.out.println();
		
		Employee employee3 = new Employee("Miranda", 70, 194.5);
		System.out.println(employee3.toString()); 
		employee3.changeRate(64.5);
		employee3.getBonuses();
		employee3.getSalary();
		System.out.println();		
						
		
        System.out.println("Total salary " + Employee.totalSum);
		

	}

}
