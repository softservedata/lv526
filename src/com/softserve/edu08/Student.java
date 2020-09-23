package com.softserve.edu08;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{

	private String name;
	private Integer course;
	
	public static class SortByCourseName implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			int result = s1.getCourse() - s2.getCourse();
			if (result == 0) {
				result = s1.getName().compareTo(s2.getName());
			}
			return result;
		}
	}
	
	public static class SortByCourse implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getCourse()- s2.getCourse();
		}
	}

	public Student() {}
	
	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}
	
	
	public static void printStudentsByCourse(List <Student> students, Integer course) {
		
		Iterator<Student> it = students.iterator();
		
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getCourse().equals(course)) {
				System.out.println(s);
			}
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		
		Student other = null;
		if (other instanceof Student) {
			other = (Student) obj;
		}else {
			return false;
		}
		
		if (((course == null) && (other.course != null))
			|| ((course != null) && (other.course == null))){
				return false;
		} else if ((course == null) && (other.course == null)) {
			return true;
		} else if (!course.equals(other.course))
			return false;
		
		if (((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))){
					return false;
			} else if ((name == null) && (other.name == null)) {
				return true;
			} else if (!name.equals(other.name))
				return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
	
	
	
}
