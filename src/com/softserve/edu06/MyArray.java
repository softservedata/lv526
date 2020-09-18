package com.softserve.edu06;

import java.util.Arrays;

public class MyArray {
	private int[] num = {5, 8, 14, -8, 0, -22, 8, -16, 23, -99};

	public String getNum() {
		return Arrays.toString(num);
	}
	
	public int max() {
		int max = num[0];
		for (int i:num) {
			if (i>max) {
				max = i;
			}
		}
		return max;
	}
	
	public int sumPositive() {
		int sum = 0;
	
		for (int i:num) {
			if (i>0) {
				sum +=i;
			}
		}
		return sum;
	}

	public int amountNegative() {
	int amount = 0;
	for (int i:num) {
		if (i<0) {
			amount++;
		}
	}
	return amount;
}
	
	public int amountPositive() {
		int amount = 0;
		for (int i:num) {
			if (i>0) {
				amount++;
			}
		}
		return amount;
	}

}



