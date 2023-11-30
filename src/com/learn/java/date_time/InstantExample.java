package com.learn.java.date_time;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("Print instant " + instant);
		System.out.println("Actual machine time" + instant.getEpochSecond());
		System.out.println("First second of epoc/ starting of poc " + instant.ofEpochMilli(0));
		Instant instant2 = Instant.now();
		Duration duration = Duration.between(instant, instant2);
		System.out.println("Duration in nanosec " + duration.getNano());
	}

}
