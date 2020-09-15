package com.softserve.hw7;

public class Appl {
	public static void main(String[] args) {
		Bird arr[] = new Bird[4];

		Eagle e = new Eagle("brown", true, "Eagle");
		Swallow s = new Swallow("while", true, "Swallow");
		Penguin p = new Penguin("dark", true, "Penguin");
		Chicken c = new Chicken("yellow", true, "Chicken");
		arr[0] = e;
		arr[1] = s;
		arr[2] = p;
		arr[3] = c;
		for (int i = 0; i < arr.length; i++) {
			
			arr[i].output();
			arr[i].fly();
		}
	}

}
