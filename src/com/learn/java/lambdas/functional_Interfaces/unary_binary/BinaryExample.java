package com.learn.java.lambdas.functional_Interfaces.unary_binary;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(5, 8));
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of maxBy is :" + maxBy.apply(5, 8));
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result of maxBy is :" + minBy.apply(5, 8));

	}

}
