package com.softserve.edu.lesson07.practicaltask.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		// Create new Array
		List<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));
		arrayList.add(random.nextInt(50));

		// Print original Array
		System.out.println("Original Array  \t\t = " + arrayList);

		// Add new elements in position 2,8,5
		arrayList.add(2, 1);
		arrayList.add(8, -3);
		arrayList.add(5, -4);

		// Print new Array
		System.out.println("Array with add 2,8,5 elements    = " + arrayList);

		// Create new collection and add elements from Array if they are >5
		List<Integer> newCollection = new ArrayList<>();
		for (Integer arrays : arrayList) {
			if (arrays > 5) {
				newCollection.add(arrays);
			}

		}

		// Delete elements if they > 20 from Array
		Iterator<Integer> it = arrayList.iterator();
		while (it.hasNext()) {
			if (it.next() > 20) {
				it.remove();
			}

		}

		System.out.println("newCollection \t\t\t = " + newCollection);
		System.out.println("Array < 20 \t\t\t = " + arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Position = " + i + " value = " + arrayList.get(i));
		}

		// Sorted Array
		Collections.sort(arrayList);
		System.out.println("Sorted  Array \t\t\t = " + arrayList);
	}

}