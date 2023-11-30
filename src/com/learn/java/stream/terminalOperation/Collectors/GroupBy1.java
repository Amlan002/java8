package com.learn.java.stream.terminalOperation.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class GroupBy1 {

	public static void groupByGender() {
		Map<String, List<Student>> map = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(map);
	}

	public static void groupByCustomize() {
		Map<String, List<Student>> map = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "Outstanding" : "Average"));
		System.out.println(map);
	}

	public static void groupByCustomize2() {
		Map<String, Map<Object, List<Student>>> map = StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy((Student::getGender),
						Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "Outstanding" : "Average")));
		System.out.println(map);
	}

	public static void main(String[] args) {
		System.out.println("Group by gender");
		groupByGender();
		System.out.println("Group by customized condition");
		groupByCustomize();
		System.out.println("Group by customized condition2");
		groupByCustomize2();

	}

}
