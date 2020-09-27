package com.softserve.edu.homework7.pt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Colection {

	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 integer numbers: ");

		for (int i = 0; i > 10; i++) {
			int n = scan.nextInt();
			myCollection.add(n);
		}

		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());
		myCollection.add(scan.nextInt());

		System.out.println("Keyboard input myCollection:  \t\t  " + myCollection);
		scan.close();

		List<Integer> newCollection = new ArrayList<>();
		
		for (Integer number : myCollection) {			
			if (number > 5) {
				newCollection.add(number);
			}		
		}		
		System.out.println("New Collection: \t\t\t  " + newCollection);
		
		Iterator<Integer> number = myCollection.iterator();
		while (number.hasNext()) {
			if (number.next() > 20) {
				number.remove();
			}			
		}
		System.out.println("My collection, numbers > 20: \t\t  " + myCollection);
		
		myCollection.add(2,  1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);

		System.out.println("My collection with added elements 2,8,5:  " + myCollection);
		
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("Position = " + i + " Value = " + myCollection.get(i));
		}
		
		Collections.sort(myCollection);
		System.out.println("Sorted  myCollection: \t\t\t  " + myCollection);
	}
}