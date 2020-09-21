package com.softserve.hw07;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

    public static class ByNameCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int result = st1.getName().compareTo(st2.getName());
            if (result == 0) {
                result = st1.getCourse() - st2.getCourse();
            }
            return result;
        }
    }
    
    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    private String name;
    private int course;

    public Student() {
        name = "";
        course = 0;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            System.out.println(current);
        }
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + course;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = null;
        if (obj instanceof Student) {
            other = (Student) obj;
        }
        if ((other == null) || (course != other.course) || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        } else if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
        // return id - student.getId();
    }

    @Override
    public String toString() {
        return "Student [name=" + name 
                + ", course=" + course 
                + "]";
    }

}
