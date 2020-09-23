package com.softserve.edu8.homework.third_task;

import java.util.Iterator;
import java.util.List;

public class Student {
        private String name;
        private Integer course;

//    public static class NameComparator implements Comparator<Student> {
//        @Override
//        public int compare(Student o1, Student o2) {
//            return o1.name.compareTo(o2.name);
//        }
//    }
//
//    public static class CourseComparator implements Comparator<Student>{
//            @Override
//            public int compare(Student o3, Student o4) {
//                return o3.course - o4.course;
//            }
//    }

        public Student() {
        }
        public Student(String name, Integer course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        public Integer getCourse() {
            return course;
        }

        public void setCourse(Integer course) {
            this.course = course;
        }


        public int compareName(Student o) {
            return name.compareTo(o.getName());
        }
        public int compareCourse(Student o) {
            return course - o.course ;
        }


        public void printStudents(List students, Integer course){
            Iterator<Student> objectIterator = students.iterator();
            while (objectIterator.hasNext()){
                Student a = objectIterator.next();
                if(a.getCourse().equals(course)){
                    System.out.println("Students on "+course +" course");
                    System.out.println("Student = " + a.getName() );
                }
            }
        }

    }
