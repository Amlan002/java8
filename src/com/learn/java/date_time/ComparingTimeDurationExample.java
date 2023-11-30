package com.learn.java.date_time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(7, 20);
		LocalTime localTime1 = LocalTime.of(8, 45);
		long diffInMin = localTime.until(localTime1, ChronoUnit.MINUTES);
		System.out.println("Difference between two time " + diffInMin);
		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("Duration in min " + duration.toMinutes());
		System.out.println("Duration in hour " + duration.toHours());

		Duration duration2 = Duration.ofHours(3);
		System.out.println("To min " + duration2.toMinutes());
		Duration duration3 = Duration.ofMinutes(3);
		System.out.println("In sec " + duration3.toSeconds());

	}

}
