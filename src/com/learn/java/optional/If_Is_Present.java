package com.learn.java.optional;

import java.util.Optional;

public class If_Is_Present {

	public static void main(String[] args) {
		Optional<String> optional1 = Optional.ofNullable("A");
		Optional<String> optional2 = Optional.ofNullable(null);
		System.out.println(optional1.isPresent());
		System.out.println(optional2.isPresent());
		optional1.ifPresent(s -> System.out.println(optional1.get()));
		optional2.ifPresent(s -> System.out.println(optional2.get()));
	}

}
