package com.softserve.edu.task5.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Student(),
                new Cleaner(),
                new Teacher()
        };

        for(int i = 0; i < persons.length; i++){
            persons[i].print();
//            persons[i].salary();
        }

    }
}
