package com.softserve.edu12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class HomeworkDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek());
		System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));
	}
}
