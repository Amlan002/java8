package com.learn.java.lambdas.functional_Interfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerExample {
	static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

	public static void printName() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(c2);
	}

	public static void printNameActivities() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(c2.andThen(c3));// consumer chain
	}

	public static void printNameByGradeCondition() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach((stu) -> {
			if (stu.getGradeLevel() >= 3) {
				c2.andThen(c3).accept(stu);
			}
		});
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java 8");
		System.out.println("============Consumer===========");
		printName();
		System.out.println("============Consumer-Chain===========");
		printNameActivities();
		System.out.println("============Consumer-condition-based===========");
		printNameByGradeCondition();

	}

}
