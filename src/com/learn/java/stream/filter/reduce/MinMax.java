package com.learn.java.stream.filter.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
	public static int maxval(List<Integer> x) {
		return x.stream().reduce(0, (a, b) -> a > b ? a : b);
	}

	public static Optional<Integer> maxvalOptional(List<Integer> x) {
		return x.stream().reduce((a, b) -> a > b ? a : b);
	}

	public static int minval(List<Integer> x) {
		return x.stream().reduce(0, (a, b) -> a < b ? a : b);
	}

	public static Optional<Integer> minvalOptional(List<Integer> x) {
		return x.stream().reduce((a, b) -> a < b ? a : b);
	}

	public static void main(String[] args) {
		
		// to find min/max always use optional
		List<Integer> integers = Arrays.asList(2, 1, 5, 7, 4, 9, 3);
		System.out.println("Max value " + maxval(integers));
		List<Integer> integers2 = new ArrayList<>();
		System.out.println("Max value using optional \n");
		if (maxvalOptional(integers2).isPresent()) {
			System.out.println(maxvalOptional(integers2).get());
		} else {
			System.out.println("Input list is empty");
		}

		System.out.println("Min value " + minval(integers));
		System.out.println("Min value using optional \n");
		if (minvalOptional(integers).isPresent()) {
			System.out.println(minvalOptional(integers).get());
		} else {
			System.out.println("Input list is empty");
		}
	}

}
