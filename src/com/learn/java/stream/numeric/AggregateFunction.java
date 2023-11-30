package com.learn.java.stream.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunction {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum is "+sum);
		OptionalInt max = IntStream.rangeClosed(1, 50).max();
		System.out.println("Max value is "+(max.isPresent()?max.getAsInt():0));
		OptionalLong min =LongStream.rangeClosed(35, 100).min();
		System.out.println("Min value is "+(min.isPresent()?min.getAsLong():0));
		OptionalDouble avg=IntStream.rangeClosed(1, 50).average();
		System.out.println("Avg value is "+(avg.isPresent()?avg.getAsDouble():0));

	}

}
