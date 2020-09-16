package chapter6_OOP.employee;

import java.util.Scanner;

public class EmployeeStarter {

    private static void input(Employee employee) {
        Scanner scanner = new Scanner(System.in);

        if (employee instanceof ContractEmployee) {
            System.out.println("PLease enter number of hours for calculate salary for contractEmployee");
            int i = scanner.nextInt();
            System.out.println("Sallary is : " + employee.calculatePay(i));
        } else if (employee instanceof SalariedEmployee) {
            System.out.println("PLease enter fixed salary for calculate salary for salariedEmployee");
            int i = scanner.nextInt();
            System.out.println("Sallary is :" + employee.calculatePay(i));
        }

    }

    private static void avarageCounter(Employee[] employees) {
        for (Employee employee : employees) {

        }
    }


    public static void main(String[] args) {
        Employee contractEmployee1 = new ContractEmployee();
        Employee salariedEmployee1 = new SalariedEmployee();
        Employee salariedEmployee2 = new SalariedEmployee();
        Employee contractEmployee2 = new ContractEmployee();
        Employee salariedEmployee3 = new SalariedEmployee();
        Employee[] employeeArray = {contractEmployee1, salariedEmployee1, salariedEmployee2, salariedEmployee3, contractEmployee2};
        for (Employee employee : employeeArray) {
            input(employee);
            System.out.println(employee + "\n ---------------------");
        }

    }
}
