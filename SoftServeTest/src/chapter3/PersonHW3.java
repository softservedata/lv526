package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonHW3 {
    private String name;
    private String lastName;
    private int age;

    public PersonHW3() {
    }

    public PersonHW3(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void intput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name of person - ");
        name = bufferedReader.readLine();
        System.out.println("Enter lastName of person - ");
        lastName = bufferedReader.readLine();
        System.out.println("Enter age of person - ");
        age = Integer.parseInt(bufferedReader.readLine());
    }

    private void output() {
        System.out.println("{Name is : " + name + "}" + "{" + " LastName is : " + lastName + "}" + "{" + " age is : " + age + "}");
    }

    private void changeName() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please change Name -");
        name = bufferedReader.readLine();

        System.out.println("Please change last name -");
        lastName = bufferedReader.readLine();

    }

    public static void main(String[] args) throws IOException {
        PersonHW3 person1 = new PersonHW3();
        person1.intput();
        person1.output();
        person1.changeName();
        person1.output();
        System.out.println(person1.getAge());
}


}
