package com.learn.java.stream.terminalOperation.Collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class MaxMinBy {
	public static Optional<Student> minBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	public static Optional<Student> maxBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	public static void main(String[] args) {
		System.out.println("Least GPA " + minBy().get());
		System.out.println("Biggest GPA " + maxBy().get());

	}

}
