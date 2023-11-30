package com.learn.java.optional;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class Or_Else_ElseGet_ElseThrow {

	public static String optionalOrElse() {
		// Optional<Student> optional =
		// Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<Student> optional = Optional.ofNullable(null);
		String name = optional.map(Student::getName).orElse("Default");
		return name;
	}

	public static String optionalOrElseGet() {
		// Optional<Student> optional =
		// Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<Student> optional = Optional.ofNullable(null);
		String name = optional.map(Student::getName).orElseGet(() -> "Default");
		return name;
	}

	public static String optionalOrElseThrow() {
		// Optional<Student> optional =
		// Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<Student> optional = Optional.ofNullable(null);
		String name = optional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Found"));
		return name;
	}

	public static void main(String[] args) {
		System.out.println("Name using optionalOrElse -" + optionalOrElse());
		System.out.println("Name using optionalOrElseGet -" + optionalOrElseGet());
		System.out.println("Name using optionalOrElseThrow -" + optionalOrElseThrow());
	}

}
