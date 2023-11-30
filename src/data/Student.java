package data;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private int noteBooks;
	private List<String> activities;
	private Optional<Bike> bike = Optional.empty();

	public void printListActivities() {
		System.out.println(activities);
	}

	public Student(String name) {
		this.name = name;
	}

}
