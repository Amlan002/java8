package com.learn.java.lambdas.functional_Interfaces.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDatabase;

public class BiConsumerExample {
	static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
			.println(name + ":" + activities);

	public static void printNameActivities() {
		List<Student> list = StudentDatabase.getAllStudents();
		list.forEach(s -> biConsumer.accept(s.getName(), s.getActivities()));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a : " + a + " ,b : " + b);
		};
		biConsumer.accept("Aml", "an");
		BiConsumer<Integer, Integer> add = (a, b) -> {
			System.out.println("Addition is " + (a + b));
		};
		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division is " + (a / b));
		};
		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication is " + (a * b));
		};

		add.andThen(division).andThen(multiply).accept(4, 2);
		
		System.out.println("==============");
		printNameActivities();
	}

}
