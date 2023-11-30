package com.learn.java.stream.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {
	public static int sumOfNNum(List<Integer> integers) {
		return integers.stream().reduce(0, (x, y) -> x + y); // unboxing to convert the Integer to int
	}

	public static int sumOfNNumUsingIntStream(List<Integer> integers) {
		return IntStream.rangeClosed(1, 3).sum();
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Sum is " + sumOfNNum(integers));
		System.out.println("Sum is Int stream " + sumOfNNumUsingIntStream(integers));
	}

}
