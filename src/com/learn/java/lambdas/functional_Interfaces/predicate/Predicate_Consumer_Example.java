package com.learn.java.lambdas.functional_Interfaces.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class Predicate_Consumer_Example {
	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
	BiConsumer<String, List<String>> stuBiConsumer = (n, a) -> System.out.println("Name- " + n + " : Activities- " + a);
	Consumer<Student> consumer = stu -> {
		if (p1.and(p2).test(stu)) {
			stuBiConsumer.accept(stu.getName(), stu.getActivities());
		}
	};

	public void printNameActivities(List<Student> list) {
		list.forEach(consumer);
	}

	public static void main(String[] args) {
		List<Student> list = StudentDatabase.getAllStudents();
		new Predicate_Consumer_Example().printNameActivities(list);
	}

}
