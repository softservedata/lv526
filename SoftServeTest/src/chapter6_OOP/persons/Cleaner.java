package chapter6_OOP.persons;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void salary() {
        System.out.println(" **** Claeners salary is : " + 80 + " **** ");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
