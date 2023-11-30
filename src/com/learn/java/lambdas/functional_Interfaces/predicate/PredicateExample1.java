package com.learn.java.lambdas.functional_Interfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {
	static Predicate<Integer> predicate = (i) -> {
		return i % 2 == 0;
	};
	static Predicate<Integer> predicate2 = (i) -> i % 2 == 0;

	static Predicate<Integer> predicate3 = (i) -> i % 5 == 0;

	public static void predicateAnd() {
		System.out.println("Predicate And================");
		System.out.println(predicate2.and(predicate3).test(10));
		System.out.println(predicate2.and(predicate3).test(15));
	}
	public static void predicateOr() {
		System.out.println("Predicate or================");
		System.out.println(predicate2.or(predicate3).test(10));
		System.out.println(predicate2.or(predicate3).test(15));
		System.out.println(predicate2.or(predicate3).test(8));
		System.out.println(predicate2.or(predicate3).test(9));
	}
	public static void predicateNaget() {
		System.out.println("Predicate Naget (opposite of actual result)================");
		System.out.println(predicate2.and(predicate3).negate().test(10));
		System.out.println(predicate2.or(predicate3).negate().test(15));
		System.out.println(predicate2.or(predicate3).negate().test(9));

	}
	public static void main(String[] args) {

		System.out.println(predicate.test(4));
		System.out.println(predicate2.test(4));
		predicateAnd();
		predicateOr();
		predicateNaget();
	}
}
