package com.learn.java.stream.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxing {
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
				// int
				.boxed()
				// Integer
				.collect(Collectors.toList());
	}

	public static int unBoxing(List<Integer> integers) {
		return integers.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		System.out.println("List of Integer (boxing) " + boxing());
		System.out.println("Sum (unboxing) " + unBoxing(boxing()));
	}

}
