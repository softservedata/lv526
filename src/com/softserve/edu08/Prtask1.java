package com.softserve.edu08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Prtask1 {

	public static void main(String[] args) {
		//
		Prtask1 obj = new Prtask1();
		
		List<Integer> myCollection = new ArrayList<>(10);

		obj.fillColl(myCollection);

		System.out.println("myCollection = " + myCollection);
	
		//
		obj.newColl(myCollection, 5);
		//
		myCollection.set(2, 1);
		myCollection.set(8, -3);
		myCollection.set(5, -4);
		
		System.out.println("Modified myCollection:");
		for (int i = 0; i<10; i++) {
		System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
		}
		//
		
		obj.remove(myCollection, 20);
		System.out.println("myCollection (elements grater than 20 were removed) = " + myCollection);
		///
		
		Collections.sort(myCollection);
		System.out.println("myCollection sorted: " + myCollection);
	}
	
	public void  fillColl(List<Integer> list) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(50));
		}
	}
	
	public List<Integer> newColl(List<Integer> list, int i) {
		List<Integer> newCollection = new LinkedList<>();

		for(Integer l:list) {
			if (l > i) {
			newCollection.add(l);
			}
		}
		System.out.println("newCollection = " + newCollection);
		
		return newCollection;
	}
	
	public List<Integer> remove(List<Integer> list, int i){
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			if (iter.next()>i) {
				iter.remove();
			}
		}
		return list;
	}
}
