package com.softserve.edu.task4.employee;

class Main{
    public static void main(String args[]){
        //create array of employee object
        Employee[] obj = new Employee[5];

        //create actual employee object
        obj[0] = new Employee();
        obj[1] = new Employee();
        obj[2] = new Employee();
        obj[3] = new Employee();
        obj[4] = new Employee();

        //assign data to employee objects
        obj[0].setData("Ivan", 1, 1320);
        obj[1].setData("Misha",2, 1200);
        obj[2].setData("Ihor",3, 1180);
        obj[3].setData("Vova",4, 910);
        obj[4].setData("Kolya",5, 1100);

        //display the employee object data
        System.out.println("Employee 1:");
        obj[0].showData();
        System.out.println("Employee 2:");
        obj[1].showData();
        System.out.println("Employee 3:");
        obj[2].showData();
        System.out.println("Employee 4:");
        obj[3].showData();
        System.out.println("Employee 5:");
        obj[4].showData();
    }
}

public class Employee {
    private String name;
    private int department_number;
    private int salary;
    public void setData(String n, int d, int s){
        name=n;
        department_number=d;
        salary=s;
    }

    public void showData(){

        System.out.print(toString());
        System.out.println();
    }
    @Override
    public String toString() {
        return "Employee{" +
                "Name = '" + name + '\'' +
                ", Department number= " + department_number +
                ", Salary= " + salary +
                '}';
    }
}
