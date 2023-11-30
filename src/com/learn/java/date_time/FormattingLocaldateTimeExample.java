package com.learn.java.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocaldateTimeExample {
	public static void parseLocaldateTie() {
		System.out.println("String to date time ....");
		String dateTime = "2018-04-18T14:33:33";
		LocalDateTime dateTime2 = LocalDateTime.parse(dateTime);
		System.out.println("Local date time1 " + dateTime2);
		LocalDateTime dateTime3 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("Local date time2 " + dateTime3);

		// custom

		String dateTime1 = "2018-04-18T14|33|33";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime dateTime4 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
		System.out.println("Local date time3 " + dateTime4);

		String dateTime5 = "2018-04-18abc14|33|33";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime dateTime6 = LocalDateTime.parse(dateTime5, dateTimeFormatter1);
		System.out.println("Local date time4 " + dateTime6);
	}

	public static void formatLocaldateTie() {
		System.out.println("date time to string ....");
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime dateTime = LocalDateTime.now();
		String string = dateTime.format(dateTimeFormatter1);
		System.out.println("String date time " + string);
	}

	public static void main(String[] args) {
		parseLocaldateTie();
		formatLocaldateTie();
	}

}
