package com.learn.java.date_time;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2019, 2, 6);
		LocalDate localDate2 = LocalDate.of(2020, 12, 8);
		Period period = localDate1.until(localDate2);
		System.out.println("Day differ(only day, doesnot care about month) " + period.getDays());
		System.out.println("Month differ " + period.getMonths());
		System.out.println("Year differ " + period.getYears());

		Period period1 = Period.ofDays(10);
		System.out.println("period get days " + period1.getDays());

		Period period2 = Period.ofYears(10);
		System.out.println("period get years " + period2.getYears());
		System.out.println("total months in 10 years " + period2.toTotalMonths());

		Period period3 = Period.between(localDate1, localDate2);
		System.out.println("Difference " + period3.getDays() + ":" + period3.getMonths() + ":" + period3.getYears());

	}

}
