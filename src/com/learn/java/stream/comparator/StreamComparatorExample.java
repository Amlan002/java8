package com.learn.java.stream.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamComparatorExample {

	public static List<Student> sortStudentByNameUsingComparator_Lambda() {
		return StudentDatabase.getAllStudents().stream().sorted((x, y) -> x.getName().compareTo(y.getName()))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByNameUsingComparator_MethodReference() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> reverseStudentByGPAUsingComparator_MethodReference() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("Print student in sorted manner by name using Comparator and Lambda :\n"
				+ sortStudentByNameUsingComparator_Lambda());
		System.out.println("Print student in sorted manner by name using Comparator and Method reference :\n"
				+ sortStudentByNameUsingComparator_MethodReference());
		System.out.println("Print student in reverse sorted manner by GPA using Comparator and Method reference :\n"
				+ reverseStudentByGPAUsingComparator_MethodReference());
	}

}
