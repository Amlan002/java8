package com.learn.java.default_static_Method;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		List<Integer> integers = Arrays.asList(4, 3, 5, 6, 7);
		System.out.println("Result is " + multiplier.multiply(integers));
		System.out.println("Default method size of list is " + multiplier.size(integers));
		System.out.println("Static method size of list is " + Multiplier.isEmpty(integers));
	}

}
