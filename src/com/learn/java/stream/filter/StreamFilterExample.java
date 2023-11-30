package com.learn.java.stream.filter;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFilterExample {

	public static List<Student> filterFemaleStudent() {
		return StudentDatabase.getAllStudents().stream().filter(stu -> stu.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("Printing female student \n" + filterFemaleStudent());
	}

}
