package com.softserve.edu.homework9.pt2;

public class Plants {

	public static void main(String[] args) {
		Plant [] ap= new Plant[5];
		try {
			ap [0] = new Plant ("rose", "red", 4);			
			ap [1] = new Plant ("daisy", "white", 3);			
			ap [2] = new Plant ("bluebell", "blue", 2);			
			ap [3] = new Plant ("iris", "red", 5);			
			ap [4] = new Plant ("rose", "white", 5);
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
		for(Plant current : ap) {
			System.out.println(current);
		}
	}
}