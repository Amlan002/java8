package com.learn.java.lambdas.functional_Interfaces.function;

import java.util.function.Function;

public class FunctionExample1 {
	static Function<String, String> function = (name) -> name.toUpperCase();
	static Function<String, String> addString = (name) -> name.toUpperCase().concat(" default");

	public static void main(String[] args) {
		System.out.println("Result is " + function.apply("Amlan Mahapatra"));
		System.out.println("Result of and then is " +function.andThen(addString).apply("Amlan mahapatra"));
		System.out.println("Result of and then is " +function.compose(addString).apply("Amlan mahapatra"));
	}

}
