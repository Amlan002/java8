package com.learn.java.lambdas.functional_Interfaces.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDatabase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> supplier = () -> {
			return new Student("x", 0, 0, "F", 0, Arrays.asList("walk"), java.util.Optional.empty());
		};
		Supplier<List<Student>> supplier2 = () -> StudentDatabase.getAllStudents();
		System.out.println("Student is " + supplier.get());
		System.out.println("All :" + supplier2.get());
	}

}
