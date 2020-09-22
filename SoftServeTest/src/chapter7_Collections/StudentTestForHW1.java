package chapter7_Collections;

import java.security.PrivateKey;
import java.util.Comparator;
import java.util.Objects;

public class StudentTestForHW1 implements Comparable<StudentTestForHW1> {

    public static class ByName implements Comparator<StudentTestForHW1> {
        @Override
        public int compare(StudentTestForHW1 o1, StudentTestForHW1 o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class ByCourse implements Comparator<StudentTestForHW1> {
        @Override
        public int compare(StudentTestForHW1 o1, StudentTestForHW1 o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }

    private String name;
    private int course;

    public StudentTestForHW1() {
        name = "";
        course = 0;
    }

    public StudentTestForHW1(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentTestForHW1)) return false;
        StudentTestForHW1 that = (StudentTestForHW1) o;
        return getCourse() == that.getCourse() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    @Override
    public int compareTo(StudentTestForHW1 studentTestForHW1) {
        return name.compareTo(studentTestForHW1.name);
        // return id = student.getId();
    }

    @Override
    public String toString() {
        return "StudentTestForHW1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}


