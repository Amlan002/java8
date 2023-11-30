package com.learn.java.default_static_Method;

import java.util.List;

public interface Multiplier {
	int multiply(List<Integer> integers);

	default int size(List<Integer> integers) {
		return integers.size();
	}

	static boolean isEmpty(List<Integer> integers) {
		return integers != null && integers.size() > 0;
	}
}
