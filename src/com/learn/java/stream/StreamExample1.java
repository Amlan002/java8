package com.learn.java.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamExample1 {

	public static void main(String[] args) {

		Predicate<Student> predicate = (x -> x.getGradeLevel() >= 3);
		Predicate<Student> predicate2 = (y -> y.getGpa() >= 3.9);

		Map<String, List<String>> mapNameActivities1 = StudentDatabase.getAllStudents().stream()
				// to debug stream
				// .peek(stu -> System.out.println(stu))
				// adding normal condition
				.filter(s -> s.getGradeLevel() >= 3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println("using filter type1" + mapNameActivities1);

		Map<String, List<String>> mapNameActivities2 = StudentDatabase.getAllStudents().stream()
				// adding predicate as condition
				.filter(predicate).collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println("using filter type2" + mapNameActivities2);

		Map<String, List<String>> mapNameActivities3 = StudentDatabase.getAllStudents().stream()
				// adding multiple predicate as condition
				.filter(predicate).filter(predicate2)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println("using filter type3" + mapNameActivities3);
	}

}
