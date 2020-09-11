package chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pract2Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Pract2Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    private static void employeesFromDepart(Pract2Employee[] employees) {
        Pract2Employee[] employeestest = new Pract2Employee[5];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter department number (1 or 2) : ");
        int depNum = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == depNum) {
                employeestest[i] = employees[i];
            }
        }
        for (Pract2Employee pract2Employee : employeestest) {
            System.out.println(pract2Employee);
        }
    }

    private static void arrangerDescendingWorkersCompar(Pract2Employee[] array) {
        Arrays.sort(array, Comparator.comparing(Pract2Employee::getSalary).reversed());
        for (Pract2Employee employee : array) {
            System.out.println(employee);
        }
    }

    private static void sortingByBubble(Pract2Employee[] arrayStart) {
        System.out.println("Origin array :");
        for (Pract2Employee pract2Employee : arrayStart) {
            System.out.println(pract2Employee + " ");
        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < arrayStart.length - 1; i++) {
            for (int j = 0; j < arrayStart.length - i - 1; j++) {
                if (arrayStart[j].getSalary() > arrayStart[j + 1].getSalary()) {
                    Pract2Employee temp = arrayStart[j];
                    arrayStart[j] = arrayStart[j + 1];
                    arrayStart[j + 1] = temp;

                }
            }
        }
        for (Pract2Employee pract2Employee : arrayStart) {
            System.out.println(pract2Employee);
        }
    }

    @Override
    public String toString() {
        return "Pract2Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Pract2Employee employee1 = new Pract2Employee("Nazar", 1, 400);
        Pract2Employee employee2 = new Pract2Employee("Yura", 2, 280);
        Pract2Employee employee3 = new Pract2Employee("Taras", 1, 600);
        Pract2Employee employee4 = new Pract2Employee("Igor", 2, 50);
        Pract2Employee employee5 = new Pract2Employee("Danylo", 2, 200);

        Pract2Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        employeesFromDepart(employees);
        System.out.println("-------------------------------");
        arrangerDescendingWorkersCompar(employees);
        System.out.println("-------------------------------");
        sortingByBubble(employees);
    }
}
