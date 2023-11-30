package com.learn.java.stream;

import data.Student;
import data.StudentDatabase;

public class StreamFilterMapReduce {
	private static int noOfNoteBook() {
		// return
		// StudentDatabase.getAllStudents().stream().map(Student::getNoteBooks).reduce(0,
		// (a, b) -> a + b);
		return StudentDatabase.getAllStudents().stream().filter(stu -> stu.getGradeLevel() >= 3)
				.map(Student::getNoteBooks).reduce(0, Integer::sum);

	}

	public static void main(String[] args) {
		System.out.println("total no of noteBooks \n" + noOfNoteBook());
	}

}
