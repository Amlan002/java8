package com.learn.java.optional;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class Map_Filter {
	public static void filter() {
		Optional<Student> optional = Optional.ofNullable(StudentDatabase.supplier.get());
		optional.filter(st -> st.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
	}

	public static void map() {
		Optional<Student> optional = Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<String> name = (optional.isPresent() ? optional.filter(st -> st.getGpa() >= 3.5).map(Student::getName)
				: Optional.empty());
		System.out.println(name.get());
	}

	public static void main(String[] args) {
		System.out.println("Optional filter ");
		filter();
		System.out.println("Optional map ");
		map();
	}

}
