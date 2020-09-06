package com.softserve.edu.task2.empoyee;

class Employee {
    private String name;
    private int rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public static double totalSum(int rate, int hours) {
        return (double) rate * hours;
    }

    public double getSalary() {
        return (double) rate * hours;
    }

    public double getBonuses() {
        return this.totalSum(this.rate, this.hours) * 1.1;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
    }
}

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Pokemon", 12, 3);

        Employee employee2 = new Employee("Stepan", 15,3);

        Employee employee3 = new Employee("Ahmed", 11,2);

        employee3.changeRate(12);
        employee3.getSalary();
        System.out.println("All employee");
        System.out.println(employee1 + " Total salary: " + employee1.getSalary());
        System.out.println(employee2 + " Total salary: " + employee2.getSalary() + "   " + (float)employee2.getBonuses() + " (+10% Bonuses)");
        System.out.println(employee3 + " Total salary: " + employee3.getSalary());
    }

}


