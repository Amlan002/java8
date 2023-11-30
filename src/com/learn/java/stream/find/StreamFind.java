package com.learn.java.stream.find;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class StreamFind {
	public static Optional<Student> findAny() {
		return StudentDatabase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).findAny();
	}
	public static Optional<Student> findFirst() {
		return StudentDatabase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).findFirst();
	}

	public static void main(String[] args) {
		System.out.println("find any student whose gpa is 3.9 or higher \n" + findAny().get());
		System.out.println("find first student whose gpa is 3.9 or higher \n" + findFirst().get());
	}

}
