package com.learn.java.optional;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class OptionalExample {
	public static String getStudntName_withoutOptional() {
		// assume if student is null, then it will raise exception
		Student student = StudentDatabase.supplier.get();
		if (student != null) {
			return student.getName();
		}
		return null;
	}

	public static Optional<String> getStudntName_withOptional_1() {
		Optional<Student> student1 = Optional.ofNullable(StudentDatabase.supplier.get());
		if (student1.isPresent()) {
			return student1.map(Student::getName);
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		String name = getStudntName_withoutOptional();
		System.out.println("Length of studnt name without Optional " + name.length());
		System.out.println("Length of studnt name with Optional 1");
		Optional<String> optional = getStudntName_withOptional_1();
		if (optional.isPresent()) {
			System.out.println(optional.get().length());
		} else {
			System.out.println("Name not found");
		}

	}

}
