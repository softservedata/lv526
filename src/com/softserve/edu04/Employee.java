package com.softserve.edu04;

public class Employee {
    private String name;
    private  int rate;
    private int hours;
    static int totalSum = 0;


    public Employee(){}

    public Employee(String name, int rate){
        this.name=name;
        this.rate=rate;
    }

    public Employee( String name,int hours, int rate){
        this.name=name;
        this.hours=hours;
        this.rate=rate;
    }

    public int getSalary(){
        return rate*hours;
    }
    public String toString(){
        return "Employee [Name=" + name
                + ", rate=" + rate
                + ", hours=" + hours
                + "]";
    }

    public int changeRate(int rate){
        this.rate = rate;
        return rate;
    }

    public int getBonuses(){
        return rate*hours/10;
    }
}
