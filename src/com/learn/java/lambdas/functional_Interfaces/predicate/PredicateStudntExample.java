package com.learn.java.lambdas.functional_Interfaces.predicate;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateStudntExample {
	static List<Student> list = StudentDatabase.getAllStudents();
	public static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentByGrade() {
		System.out.println("============get the student whos grade level is equal and greater than 3->");
		list.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudentByGPA() {
		System.out.println("============get the student whos gpa level is equal and greater than 3.9->");
		list.forEach(s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudentByGradeAndGPA() {
		System.out.println(
				"============get the student whos gpa level is equal and greater than 3.9 and grade level is equal and greater than 3->");
		list.forEach(s -> {
			if (p2.and(p1).test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentByGrade();
		filterStudentByGPA();
		filterStudentByGradeAndGPA();
	}

}
