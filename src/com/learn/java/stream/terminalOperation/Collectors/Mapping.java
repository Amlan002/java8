package com.learn.java.stream.terminalOperation.Collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class Mapping {

	public static void main(String[] args) {
		List<String> stringList = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println("List of name " + stringList);
		Set<String> stringSet = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println("Set of name " + stringSet);
		Map<String, List<String>> x = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println("Map "+x);
	}

}
