package com.softserve.edu.lesson07.homework.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

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

	Student() {
		name = "";
		course = 0;
	}

	Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudentsByCourse(List<Student> students, Integer course) {
		Iterator<Student> iter = students.iterator();
		String s;
		String courseNumber = String.valueOf(course);
		Pattern p = Pattern.compile("\\b[\\d]+");
		Matcher m;
		while (iter.hasNext()) {
			Student current = iter.next();
			s = current.toString();
			m = p.matcher(s);
			while (m.find()) {
				String sample = s.substring(m.start(), m.end());
				if (sample.equals(courseNumber)) {
					System.out.println(current);
				}
			}
		}
	}

	public static void printStudents(List<Student> students) {
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student current = iter.next();
			System.out.println(current);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
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
		if (obj == null || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = null;
		if (obj instanceof Student) {
			other = (Student) obj;
		}
		if ((other == null) || (course != other.course) || (name == null) && (other.name != null)
				|| (name != null) && (other.name == null)) {
			return false;
		} else if ((name == null) && (other.name == null)) {
			return true;
		}
		return name.equals(other.name);
	}

}
