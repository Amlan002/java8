package com.learn.java.stream.numeric;

import java.util.stream.IntStream;

public class Range {

	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Count " + intStream.count());
		System.out.println("Range");
		IntStream.range(0, 5).forEach(v -> System.out.println(v));
		System.out.println("Range Closed");
		IntStream.rangeClosed(0, 5).forEach(v -> System.out.println(v));
		System.out.println("in the above rechniques we can do the LongStream");
		System.out.println("Double Stream");
		IntStream.range(1, 5).asDoubleStream().forEach(v -> System.out.println(v));
	}

}
