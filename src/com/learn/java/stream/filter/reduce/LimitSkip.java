package com.learn.java.stream.filter.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkip {

	public static Optional<Integer> limit(List<Integer> in) {
		return in.stream().limit(3).reduce((x, y) -> x + y);
	}
	public static Optional<Integer> skip(List<Integer> in) {
		return in.stream().skip(3).reduce((x, y) -> x + y);
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 1, 5, 7, 4, 9, 3);
		System.out.println("adding first 3 element \n");
		if (limit(integers).isPresent()) {
			System.out.println(limit(integers).get());
		} else {
			System.out.println("Input list is empty");
		}
		System.out.println("adding without first 3 element \n");
		if (skip(integers).isPresent()) {
			System.out.println(skip(integers).get());
		} else {
			System.out.println("Input list is empty");
		}
	}

}
