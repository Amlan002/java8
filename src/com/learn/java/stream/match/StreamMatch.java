package com.learn.java.stream.match;

import data.StudentDatabase;

public class StreamMatch {
	public static boolean allMatch() {
		return StudentDatabase.getAllStudents().stream().allMatch(stu -> stu.getGpa() >= 3.9);
	}
	public static boolean anyMatch() {
		return StudentDatabase.getAllStudents().stream().anyMatch(stu -> stu.getGpa() >= 3.9);
	}
	public static boolean noneMatch() {
		return StudentDatabase.getAllStudents().stream().noneMatch(stu -> stu.getGpa() >= 4.9);
	}

	public static void main(String[] args) {
		//if u give 3.5 then it will return true
		System.out.println("if all Student with gpa 3.9 or higher \n" + allMatch());
		System.out.println("if any Student with gpa 3.9 or higher \n" + anyMatch());
		System.out.println("if no Student with gpa 4.9 or higher \n" + anyMatch());

		
		
	}

}
