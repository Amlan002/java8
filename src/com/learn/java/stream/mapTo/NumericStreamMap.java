package com.learn.java.stream.mapTo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMap {
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());
	}

	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5).mapToLong((i) -> i).sum();
	}

	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5).mapToDouble((i) -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println("Map to Object--" + mapToObject());
		System.out.println("map to Long " + mapToLong());
		System.out.println("map to double " + mapToDouble());

	}
}
