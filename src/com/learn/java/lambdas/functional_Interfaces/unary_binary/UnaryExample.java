package com.learn.java.lambdas.functional_Interfaces.unary_binary;

import java.util.function.UnaryOperator;

public class UnaryExample {
	static UnaryOperator<String> unaryOperator = (s) -> s.concat(" default");

	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("Amlan Mahapatra"));
	}

}
