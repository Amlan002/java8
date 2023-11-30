package com.learn.java.stream.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	public static long chkPerformance(Supplier<Integer> supplier, int noOfTimes) {
		long st = System.currentTimeMillis();
		for (int i = 0; i < noOfTimes; i++) {
			supplier.get();
		}
		long et = System.currentTimeMillis();
		return et - st;
	}

	public static int sum_seq() {
		return IntStream.rangeClosed(1, 1000000000).sum();
	}

	public static int sum_parallel() {
		return IntStream.rangeClosed(1, 1000000000).parallel().sum();
	}

	public static void main(String[] args) {
		System.out.println("Available processor " + Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential stream " + chkPerformance(ParallelStreamExample::sum_seq, 20));
		System.out.println("Parallel stream " + chkPerformance(ParallelStreamExample::sum_parallel, 20));
	}

}
