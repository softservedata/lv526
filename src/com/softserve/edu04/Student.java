package com.softserve.edu04;

public class Student {
    public String firstName = "Ivan";
    //protected String lastName = "Ivanov";
    String lastName = "Ivanov";
    private int age = 21;
    
    // Overload
    public void printAge() {
        System.out.println("age = " + age);
    }
    
    // Overload
    //public int printAge() {  // Error
    public void printAge(int i) {
        System.out.println("age = " + age + "  age + i = " + (age + i));
        //return 1;
    }
    
    // Overload
    public void printAge(String mail) {
        System.out.println("age = " + age + "  mail = " + mail);
    }
}
