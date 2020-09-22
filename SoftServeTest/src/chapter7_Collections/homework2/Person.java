package chapter7_Collections.homework2;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public static class ByFirstName implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return person1.getFirstName().compareTo(person2.getFirstName());
        }
    }

    public static class ByLastName implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return person1.getLastName().compareTo(person2.getLastName());
        }
    }

    public static class ByFirstNameAndLastName implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            int result = person1.getFirstName().compareTo(person2.getFirstName());
            if (result == 0) {
                result = person1.getLastName().compareTo(person2.getLastName());
            }
            return result;
        }
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        firstName = "";
        lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Person other = null;
        if (obj instanceof Person) {
            other = (Person) obj;
        }
        if ((other == null) || (lastName != other.lastName) || ((firstName == null) && (other.firstName != null))
                || ((firstName != null) && (other.firstName == null))) {
            return false;
        } else if ((firstName == null) && (other.firstName == null)) {
            return true;
        }
        return firstName.equals(other.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public int compareTo(Person person) {
        return firstName.compareTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
