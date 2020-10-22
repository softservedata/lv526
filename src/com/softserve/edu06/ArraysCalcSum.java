package com.softserve.edu06;

public class ArraysCalcSum {
		public static void main(String[] args) {
			int numbers[] = {10, 8, 3, 6, 12, 2, 9, 3, -7, -12};
						
					
					for (int j = 0; j < numbers.length; j++) {
						int sum = 0;
						if (numbers.length < 5) { 
							sum = j + numbers[j];
								System.out.println("sum = " + sum);
								System.out.println(j);						}
				}
			}
		}


