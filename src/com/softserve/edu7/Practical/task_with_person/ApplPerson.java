package com.softserve.edu7.Practical.task_with_person;

public class ApplPerson {
    public static void main(String[] args) {
        Person[] p =new Person[6];
        p[0] = new Teacher(100);
        p[1] = new Student();
        p[2] = new Cleaner(174);
        p[3] = new Student();
        p[4] = new Cleaner(131);
        p[5] = new Student();

        for (int i = 0; i < p.length ; i++) {
            p[i].print();
            System.out.println(p[i].toString());
            if (p[i] instanceof Staff){
                ((Staff)p[i]).salary();
            }
            System.out.println();
        }
    }
}
