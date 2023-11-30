package com.learn.java.lambdas.functional_Interfaces.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learn.java.lambdas.functional_Interfaces.predicate.PredicateStudntExample;

import data.Student;
import data.StudentDatabase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((stu, stuPredi) -> {
		Map<String, Double> stuGradeMap = new HashMap();
		stu.forEach((s -> {
			if (stuPredi.test(s)) {
				stuGradeMap.put(s.getName(), s.getGpa());
			}
		}));
		return stuGradeMap;
	});

	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudntExample.p1));
	}

}
