package com.softserve.edu7.Practical.task_with_person;

public class Teacher extends  Staff{
    final String TYPE_PERSON = "Teacher";
    private int hour;



    public Teacher(int hour) {
        this.hour = hour;
    }

    @Override
    void print() {
        System.out.println("Im a ..");
    }

    @Override
    void salary() {
        double salary = hour* 50;
        System.out.println("Salary of teacher =" + salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                ", hour=" + hour +
                '}';
    }

}
