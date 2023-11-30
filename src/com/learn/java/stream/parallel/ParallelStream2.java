package com.learn.java.stream.parallel;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class ParallelStream2 {
	public static List<String> printStuActiviriesUnique_seq() {
		long st = System.currentTimeMillis();
		List<String> x = StudentDatabase.getAllStudents().stream().map(Student::getActivities)// getting
																								// activities
				.flatMap(List::stream).distinct().collect(Collectors.toList());
		long et = System.currentTimeMillis();
		System.out.println("duration in sequential " + (et - st));

		return x;

	}

	public static List<String> printStuActiviriesUnique_para() {
		long st = System.currentTimeMillis();
		List<String> x = StudentDatabase.getAllStudents().parallelStream().map(Student::getActivities)// getting
																										// activities
				.flatMap(List::stream).distinct().collect(Collectors.toList());
		long et = System.currentTimeMillis();
		System.out.println("duration in parallel " + (et - st));
		return x;
	}

	public static void main(String[] args) {
		printStuActiviriesUnique_seq();
		printStuActiviriesUnique_para();
	}

}
