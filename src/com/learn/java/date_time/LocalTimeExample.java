package com.learn.java.date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime1 = LocalTime.now();
		System.out.println("Local time " + localTime1);
		LocalTime localTime2 = LocalTime.of(23, 33);
		System.out.println("Local time2 " + localTime2);
		LocalTime localTime3 = LocalTime.of(13, 33, 55);
		System.out.println("Local time3 " + localTime3);
		LocalTime localTime4 = LocalTime.of(15, 45, 50, 112);
		System.out.println("Local time4 " + localTime4);

		// getting the value

		System.out.println("Hour " + localTime1.getHour());
		System.out.println("Minute " + localTime1.getMinute());
		System.out.println("Clock hour using temporal " + localTime1.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("Current time in second " + localTime1.toSecondOfDay());

		// modifying the value

		System.out.println("Decreasing the time by 2 hours " + localTime1.minusHours(2));
		System.out.println("Decreasing the time by 3 hours using temporal " + localTime1.minus(3, ChronoUnit.HOURS));
		System.out.println("Chnage the time to midnight " + localTime1.with(LocalTime.MIDNIGHT));
		System.out.println("Change the hour of the day " + localTime1.with(ChronoField.HOUR_OF_DAY, 22));
		System.out.println("Adding 30 minute " + localTime1.plusMinutes(30));
		System.out.println("Change the hour of the time " + localTime1.withHour(4));

	}

}
