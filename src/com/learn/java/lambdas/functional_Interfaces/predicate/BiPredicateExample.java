package com.learn.java.lambdas.functional_Interfaces.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import data.Student;
import data.StudentDatabase;

public class BiPredicateExample {

	BiPredicate<Integer, Double> biPredicate = (grd, gpa) -> grd >= 3 && gpa >= 3.9;
	BiConsumer<String, List<String>> stuBiConsumer = (n, a) -> System.out.println("Name- " + n + " : Activities- " + a);
	Consumer<Student> consumer = (stu) -> {
		if (biPredicate.test(stu.getGradeLevel(), stu.getGpa())) {
			stuBiConsumer.accept(stu.getName(), stu.getActivities());

		}
	};

	public void printNameActivities(List<Student> list) {
		list.forEach(consumer);
	}

	public static void main(String[] args) {
		List<Student> list = StudentDatabase.getAllStudents();
		new BiPredicateExample().printNameActivities(list);
	}

}
