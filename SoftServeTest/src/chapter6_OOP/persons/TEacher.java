package chapter6_OOP.persons;

import chapter6_OOP.persons.Staff;

public class TEacher extends Staff {
    final String TYPE_PERSON = "Teacher";

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void salary() {
        System.out.println( " **** Teachers salary is : " + 50 + " **** ");

    }

    @Override
    public String toString() {
        return "TEacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
