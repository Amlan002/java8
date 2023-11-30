package com.learn.java.date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println("Zoned datetime " + dateTime);
		System.out.println("Zone Offset " + dateTime.getOffset());
		System.out.println("Zone id " + dateTime.getZone());
		// System.out.println("List of zones ");
		// ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		System.out.println("No of zones " + ZoneId.getAvailableZoneIds().size());
		System.out.println("Get CST time " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Get EST time " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("Get PST time " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Get MST time " + ZonedDateTime.now(ZoneId.of("America/Denver")));

		System.out.println(
				"Zoned datetime using clock " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Los_Angeles"))));

		// convert localdatetime,instant to zonedlocaldate and timw
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local dattime " + localDateTime);
		ZonedDateTime dateTime2 = localDateTime.atZone(ZoneId.of("America/Chicago"));
		System.out.println("Zoned datetime " + dateTime2);
		ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("America/Los_Angeles"));
		System.out.println("Zoned datetime " + zonedDateTime);
		OffsetDateTime dateTime3 = localDateTime.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("Offset datetime " + dateTime3);
	}

}
