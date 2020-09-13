package com.softserve.hw6;

public class DayMonth {
	

	private int monthDays[ ]  = {30,28,31,30,31,30,31,31,30,31,30,31 };
	public DayMonth() {
		
		}
	public void MD(int k) {
		for(int i=0;i<monthDays.length;i++) {
			if(i==k-1)System.out.print(monthDays[i]);
		}
	}
}
