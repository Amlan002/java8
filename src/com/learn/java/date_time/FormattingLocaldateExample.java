package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocaldateExample {

	public static void parseLocalDate() {
		System.out.println("String to date ....");
		String date = "2018-04-28";
		LocalDate date2 = LocalDate.parse(date);
		System.out.println("Local date1 " + date2);
		LocalDate date3 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("Local date2 " + date3);
		String date1 = "20230526";// yyyyMMdd
		LocalDate date4 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Local date3 " + date4);

		// custom same applies to *

		String date5 = "2022|07|29";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate date6 = LocalDate.parse(date5, dateTimeFormatter);
		System.out.println("Local date4 " + date6);
	}

	public static void formatLocalDate() {
		System.out.println("Date to string ....");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate date = LocalDate.now();
		String string = date.format(dateTimeFormatter);
		System.out.println("Date string " + string);
	}

	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}
