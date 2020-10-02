package com.softserve.edu.homework8.hw;

class Space {
	public String mergeSpace(String st) {
		st = st.replaceAll("\\s+", " ");
		return st;
	}
}

public class MergeSpaces {

	public static void main(String[] args) {

		String st = "I            am      learning         Java   Core";

		Space space = new Space();
		System.out.println(space.mergeSpace(st));

	}
}