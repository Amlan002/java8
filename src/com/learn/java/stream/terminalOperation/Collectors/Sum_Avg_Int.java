package com.learn.java.stream.terminalOperation.Collectors;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class Sum_Avg_Int {
	public static int sum() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}

	public static Double avg() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println("Sum of all notebooks " + sum());
		System.out.println("Avg of all notebooks " + avg());
	}

}
