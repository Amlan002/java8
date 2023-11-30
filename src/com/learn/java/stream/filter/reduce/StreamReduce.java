package com.learn.java.stream.filter.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class StreamReduce {
	public static int reduceMultiplication(List<Integer> ints) {
		return ints.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Student> getHighestGpa() {
		return StudentDatabase.getAllStudents().stream().reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 5, 7);
		System.out.println("Result is " + reduceMultiplication(integers));
		System.out.println("Highest gpa \n");
		Optional<Student> optional = getHighestGpa();
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
	}

}
