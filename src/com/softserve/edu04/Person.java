package com.softserve.edu04;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private static int count = 0;
    

    // Overload
    public Person() {
        this.firstName = "Ivan";
        this.lastName = "Ivanov";
        this.age = 21;
        count++;
    }
    
    // Overload
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Check
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // Code
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Check
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", age=" + age 
                + ", count=" + count
                + "]";
    }
    
}
