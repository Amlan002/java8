package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ModifyingLocalDate {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date " + localDate);
		System.out.println("Local date after increasing 2 days " + localDate.plusDays(2));
		System.out.println("Local date after decreasing 2 days " + localDate.minusDays(2));
		System.out.println("Local date after increasing 2 months " + localDate.plusMonths(2));
		System.out.println("Local date after after changing the year " + localDate.withYear(2025));
		System.out.println("Local date after after changing the year " + localDate.with(ChronoField.YEAR, 2026));
		System.out.println("First Day of next month " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("Local date after decreasing 2 years " + localDate.minusYears(2));
		System.out.println("Local date after decreasing 1 decade " + localDate.minus(1, ChronoUnit.DECADES));
		// Additional handy class
		System.out.println("check leapyear " + localDate.isLeapYear());
		LocalDate localDate1 = LocalDate.of(2023, 11, 9);
		System.out.println("Compare two dates " + localDate.isEqual(localDate1));
		System.out.println("is before " + localDate.isBefore(localDate1));
		System.out.println("is after " + localDate.isAfter(localDate1));
	}

}
