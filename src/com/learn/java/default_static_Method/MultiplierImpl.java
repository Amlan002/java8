package com.learn.java.default_static_Method;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integers) {
		return integers.stream().reduce(1, (x, y) -> x * y);
	}

}
