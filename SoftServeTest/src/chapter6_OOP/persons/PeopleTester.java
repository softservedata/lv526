package chapter6_OOP.persons;

public class PeopleTester {

    private static void chacker(Person person){
        if (person instanceof Staff ){
            ((Staff) person).salary();
        }
    }



    public static void main(String[] args) {

        Person student = new Student();
        Person teacher = new TEacher();
        Person cleaner = new Cleaner();
        Person teacher1 = new TEacher();
        Person cleaner1 = new Cleaner();

        Person [] persons = {student , cleaner , teacher , teacher1 , cleaner1};
        for (Person person : persons) {
            person.print();
            System.out.print(person);
            chacker(person);
            System.out.println();
        }
    }
}
