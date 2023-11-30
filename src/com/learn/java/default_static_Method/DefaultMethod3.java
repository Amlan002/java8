package com.learn.java.default_static_Method;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class DefaultMethod3 {
	static Comparator<Student> nameCom = Comparator.comparing(Student::getName);
	static Consumer<Student> consumer = (s -> System.out.println(s));

	public static void sortWithNullFirst(List<Student> list) {
		System.out.println("Sorted with null first ");
		Comparator<Student> x = Comparator.nullsFirst(nameCom);
		list.sort(x);
		list.forEach(consumer);

	}

	public static void sortWithNullLast(List<Student> list) {
		System.out.println("Sorted with null last ");
		Comparator<Student> x = Comparator.nullsLast(nameCom);
		list.sort(x);
		list.forEach(consumer);

	}

	public static void main(String[] args) {
		List<Student> list = StudentDatabase.getAllStudents2();
		sortWithNullFirst(list);
		sortWithNullLast(list);
	}

}
