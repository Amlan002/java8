package com.learn.java.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	static Function<String, String> toUppaer = (s) -> s.toUpperCase();
	static Function<String, String> toUppaerMethod = String::toUpperCase;

	public static void main(String[] args) {
		System.out.println("Result " + toUppaer.apply("amlan"));
		System.out.println("Result " + toUppaerMethod.apply("mahapatra"));
	}

}
