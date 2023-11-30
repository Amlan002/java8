package com.learn.java.optional;

import java.util.Optional;

import data.Bike;
import data.Student;
import data.StudentDatabase;

public class FlateMap {
	public static void flateMap() {
		Optional<Student> optional = Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<String> s = optional.filter(stu -> stu.getGpa() >= 3.5).flatMap(Student::getBike).map(Bike::getName);
		System.out.println("Bike name -" + s.get());
	}

	public static void main(String[] args) {
		flateMap();
	}

}
