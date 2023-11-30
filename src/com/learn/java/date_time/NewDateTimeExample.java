package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Local date " + date);
		LocalTime localTime = LocalTime.now();
		System.out.println("Local time " + localTime);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Local date time " + dateTime);

	}

}
