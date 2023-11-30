package com.learn.java.stream.flatMap;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFlatMapExample {

	public static List<String> printStuActiviriesList() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities)// getting activities
				.flatMap(List::stream).collect(Collectors.toList());
	}

	public static List<String> printStuActiviriesUnique() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities)// getting activities
				.flatMap(List::stream).distinct().collect(Collectors.toList());
	}

	public static List<String> printStuActiviriesUniqueSorted() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities)// getting activities
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
	}

	public static Long getTotalUniqueActivitiesCount() {
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities)// getting activities
				.flatMap(List::stream).distinct().count();
	}

	public static void main(String[] args) {
		System.out.println("Getting the list of all activities :" + printStuActiviriesList());
		System.out.println("Getting the set of all unique activities :" + printStuActiviriesUnique());
		System.out.println(
				"Getting the set of all unique activities in sorted manner:" + printStuActiviriesUniqueSorted());
		System.out.println("Getting the no of all unique activities :" + getTotalUniqueActivitiesCount());

	}

}
