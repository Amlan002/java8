package com.learn.java.stream.map;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamMapExample1 {
	public static List<String> namesList() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toList());
	}

	public static Set<String> namesSet() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).map(String::toLowerCase)
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		System.out.println("Student name list in upper class :" + namesList());
		System.out.println("Student name list in lower class :" + namesSet());
	}

}
