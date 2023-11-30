package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date " + localDate);
		LocalDate localDate1 = LocalDate.of(2023, 11, 29);
		System.out.println("Local Date " + localDate1);
		LocalDate localDate2 = LocalDate.ofYearDay(2023, 364);
		System.out.println("Local Date " + localDate2);

		// get values from local date
		System.out.println("Current month in string " + localDate.getMonth());
		System.out.println("Current month in value " + localDate.getMonthValue());
		System.out.println("Day of the week  " + localDate.getDayOfWeek());
		System.out.println("Day of the year  " + localDate.getDayOfYear());
		System.out.println("Day of month  " + localDate.get(ChronoField.DAY_OF_MONTH));
	}

}
