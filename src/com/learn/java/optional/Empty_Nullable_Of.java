package com.learn.java.optional;

import java.util.Optional;

public class Empty_Nullable_Of {
	public static Optional<String> ofNullable() {
		// use if u r not sure about value
		Optional<String> optional = Optional.ofNullable("Hello");
		return optional;
	}

	public static Optional<String> of() {
		// use if u r sure about value
		Optional<String> optional = Optional.of("Hello");
		return optional;
	}
	public static Optional<String> empty() {
		// return empty result
 		return Optional.empty();
	}
	public static void main(String[] args) {
		System.out.println("Of nullable -" + ofNullable().get());
		System.out.println("Of -" + of().get());
		System.out.println("Empty -" + empty());
	}

}
