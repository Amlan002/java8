package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println("Current date time1 " + localDateTime1);
		LocalDateTime localDateTime2 = LocalDateTime.of(2022, 1, 1, 1, 1, 1, 1);
		System.out.println("Local date time3 " + localDateTime2);
		LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Local date time3 " + localDateTime3);

		// getting value

		System.out.println("Get hour " + localDateTime1.getHour());
		System.out.println("Get minute " + localDateTime1.getMinute());
		System.out.println("Get month " + localDateTime1.getMonth());
		System.out.println("day of the month " + localDateTime1.get(ChronoField.DAY_OF_MONTH));

		// modifying value
		System.out.println("Adding 2 hour " + localDateTime1.plusHours(2));
		System.out.println("Reducing day by 2 " + localDateTime1.minusDays(2));
		System.out.println("Change the month " + localDateTime1.withMonth(2));

		// converting localdate & localtime to localdatetime
		LocalDate localDate = LocalDate.of(2018, 1, 1);
		System.out.println("at time " + localDate.atTime(23, 23));
		LocalTime localTime = LocalTime.of(23, 39);
		System.out.println("at date " + localTime.atDate(localDate));
		LocalDateTime dateTime4 = localTime.atDate(localDate);
		System.out.println("to local date " + dateTime4.toLocalDate());
		System.out.println("to local time " + dateTime4.toLocalTime());
	}

}
