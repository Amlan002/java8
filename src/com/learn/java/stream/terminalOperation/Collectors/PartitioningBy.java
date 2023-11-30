package com.learn.java.stream.terminalOperation.Collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class PartitioningBy {

	public static Map<Boolean, List<Student>> partitionBy1() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(s -> s.getGpa() >= 3.8));
	}

	public static Map<Boolean, Set<Student>> partitionBy2() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.partitioningBy((s -> s.getGpa() >= 3.8), Collectors.toSet()));
	}

	public static void main(String[] args) {
		System.out.println("Partitioning By " + partitionBy1());
	}

}
