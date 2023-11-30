package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

	public static void main(String[] args) {

		// util date to local date and opposite
		Date dateUtil = new Date();
		System.out.println("Util Date " + dateUtil);
		LocalDate localDate = dateUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("Local date " + localDate);

		Date date = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Util date " + date);

		// sql date to local date & opposite
		java.sql.Date date2 = java.sql.Date.valueOf(localDate);
		System.out.println("sql date " + date2);
		LocalDate date3 = date2.toLocalDate();
		System.out.println("Local date " + date3);

	}

}
