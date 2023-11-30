package com.learn.java.lambdas.functional_Interfaces.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class FunctionExample2 {
	static Predicate<Student> p1 = stud -> stud.getGradeLevel() >= 3;

	static Function<List<Student>, Map<String, Double>> function = (s -> {
		Map<String, Double> studentGrdMp = new HashMap<String, Double>();

		s.forEach(stu -> {
			if (p1.test(stu)) {
				studentGrdMp.put(stu.getName(), stu.getGpa());
			}
		});

		return studentGrdMp;
	});

	public static void main(String[] args) {
		System.out.println(function.apply(StudentDatabase.getAllStudents()));
	}

}
