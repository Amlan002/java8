package com.learn.java.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import data.Student;

public class ConstructorReference {
	static Supplier<Student> supplier = Student::new;
	static Function<String, Student> function = Student::new;

	public static void main(String[] args) {
		System.out.println(supplier.get());
		System.out.println(function.apply("Amlan"));
	}

}
