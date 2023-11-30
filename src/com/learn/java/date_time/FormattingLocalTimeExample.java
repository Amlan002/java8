package com.learn.java.date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
	public static void parseTime() {
		System.out.println("String to time ....");
		String time = "13:30";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("Local time1 " + localTime);
		LocalTime localTime2 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("Local time2 " + localTime2);

		// custom
		String time1 = "13*02";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime3 = LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("Local time3 " + localTime3);

		String time2 = "13*22*10";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime4 = LocalTime.parse(time2, dateTimeFormatter2);
		System.out.println("Local time4 " + localTime4);

	}

	public static void formatTime() {
		System.out.println("Time to string ....");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime localTime = LocalTime.now();
		String string = localTime.format(dateTimeFormatter2);
		System.out.println("String time " + string);
	}

	public static void main(String[] args) {
		parseTime();
		formatTime();
	}

}
