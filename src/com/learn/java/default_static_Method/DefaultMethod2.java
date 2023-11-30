package com.learn.java.default_static_Method;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class DefaultMethod2 {
	static Consumer<Student> consumer = (s -> System.out.println(s));
	static Comparator<Student> nameCom = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaCom = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeCom = Comparator.comparingDouble(Student::getGradeLevel);

	public static void sortByName(List<Student> list) {
		System.out.println("After Sort By name");
		list.sort(nameCom);
		list.forEach(consumer);
	}

	public static void sortByGpa(List<Student> list) {
		System.out.println("After Sort By gpa");
		list.sort(gpaCom);
		list.forEach(consumer);
	}

	public static void comparatorChain(List<Student> list) {
		System.out.println("After Sort By comparatorChain");
		list.sort(gradeCom.thenComparing(nameCom));
		list.forEach(consumer);
	}

	public static void main(String[] args) {
		List<Student> x = StudentDatabase.getAllStudents();
		System.out.println("Before sort");
		x.forEach(consumer);
		sortByName(x);
		sortByGpa(x);
		comparatorChain(x);
	}

}
