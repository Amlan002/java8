package com.learn.java.stream.of_iterate_generate;

import java.util.Random;
import java.util.stream.Stream;

public class OfIterateGenerate {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Adam", "Eve", "Amlan");
		stream.forEach(System.out::println);
		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);
		System.out.println();
		Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);

	}

}
