package com.learn.java.default_static_Method;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Adam", "Jenny", "Amlan", "Ric", "Erica");
		// before java 8
		Collections.sort(list);
		System.out.println("Sorted using collections sort " + list);
		List<String> list1 = Arrays.asList("Adam", "Jenny", "Amlan", "Ric", "Erica");
		// in java 8
		list1.sort(Comparator.naturalOrder());
		System.out.println("Sorted using list sort " + list1);
		list1.sort(Comparator.reverseOrder());
		System.out.println("Sorted using list sort reverse order " + list1);
	}

}
