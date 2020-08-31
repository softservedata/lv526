package com.softserve.edu4.practical_task;

public class Employee {
    private String name ;
    private double rate;
    private int hours;
    static double totalSum = 0 ;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public void getSalary(){
        double salary = rate * hours;
        System.out.println("Salary of this employee " + salary);
        totalSum +=salary;
    }
    public void changeRate(int rate){
        this.rate = rate;
    }
    public void getBonuses(){
        double bonus;
        bonus = (rate*hours *10)/100;
        System.out.println("Bonus for this employee " + bonus );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan",200,200);
        Employee e2 = new Employee("Yura",150,150);
        Employee e3 = new Employee("Stepan",220,187);
        e1.changeRate(300);
        System.out.println(e1.toString());
        e1.getSalary();
        e1.getBonuses();

        System.out.println();

        e2.changeRate(245);
        System.out.println(e2.toString());
        e2.getSalary();
        e2.getBonuses();

        System.out.println();

        e3.changeRate(175);
        System.out.println(e3.toString());
        e3.getSalary();
        e3.getBonuses();

        System.out.println();
        System.out.println("Total salary of all workers " + Employee.totalSum);
    }
}
