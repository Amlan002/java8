package com.learn.java.methodReference;

import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerMethodReferenceExample {
	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListActivities;

	public static void main(String[] args) {
		StudentDatabase.getAllStudents().forEach(c1);
		StudentDatabase.getAllStudents().forEach(c2);

	}
}
