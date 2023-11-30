package com.learn.java.stream.terminalOperation.Collectors;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class Joining {

	public static String joining1() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());

	}

	public static String joining2() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));

	}

	public static String joining3() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("/", "{", "}"));

	}

	public static void main(String[] args) {
		System.out.println("Joining all name " + joining1());
		System.out.println("Joining all name with delimeter " + joining2());
		System.out.println("Joining all name with delimeter and prefix and suffix " + joining3());
	}

}
