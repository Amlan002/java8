package com.learn.java.stream.terminalOperation.Collectors;

import java.util.stream.Collectors;

import data.StudentDatabase;

public class Counting {
	public static long count() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.counting());
	}

	public static long countBasedGpa() {
		return StudentDatabase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Counting of Student " + count());
		System.out.println("Counting based on GPA condition of Student " + countBasedGpa());

	}

}
