package data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {
	public static Supplier<Student> supplier = () -> {
		Bike bike = new Bike();
		bike.setName("Yamaha");
		bike.setModel("Gixxer");
		return new Student("Emily", 3, 4.0, "female", 12, Arrays.asList("swimming", "gymnastics", "aerobics"),
				Optional.ofNullable(bike));
	};

	public static List<Student> getAllStudents() {

		/**
		 * 2nd grade students
		 */
		Student student1 = new Student("Adam", 2, 3.6, "male", 10,
				Arrays.asList("swimming", "basketball", "volleyball"), java.util.Optional.empty());
		Student student2 = new Student("Jenny", 2, 3.8, "female", 11, Arrays.asList("swimming", "gymnastics", "soccer"),
				java.util.Optional.empty());
		/**
		 * 3rd grade students
		 */
		Student student3 = new Student("Emily", 3, 4.0, "female", 12,
				Arrays.asList("swimming", "gymnastics", "aerobics"), java.util.Optional.empty());
		Student student4 = new Student("Dave", 3, 4.0, "male", 15, Arrays.asList("swimming", "gymnastics", "soccer"),
				java.util.Optional.empty());
		/**
		 * 4th grade students
		 */
		Student student5 = new Student("Sophia", 4, 3.5, "female", 10, Arrays.asList("swimming", "dancing", "football"),
				java.util.Optional.empty());
		Student student6 = new Student("James", 4, 3.9, "male", 22,
				Arrays.asList("swimming", "basketball", "baseball", "football"), java.util.Optional.empty());

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return students;
	}

	public static List<Student> getAllStudents2() {

		/**
		 * 2nd grade students
		 */
		Student student1 = new Student("Adam", 2, 3.6, "male", 10,
				Arrays.asList("swimming", "basketball", "volleyball"), java.util.Optional.empty());
		Student student2 = new Student("Jenny", 2, 3.8, "female", 11, Arrays.asList("swimming", "gymnastics", "soccer"),
				java.util.Optional.empty());
		/**
		 * 3rd grade students
		 */
		Student student3 = new Student("Emily", 3, 4.0, "female", 12,
				Arrays.asList("swimming", "gymnastics", "aerobics"), java.util.Optional.empty());
		Student student4 = new Student("Dave", 3, 4.0, "male", 15, Arrays.asList("swimming", "gymnastics", "soccer"),
				java.util.Optional.empty());
		/**
		 * 4th grade students
		 */
		Student student5 = new Student("Sophia", 4, 3.5, "female", 10, Arrays.asList("swimming", "dancing", "football"),
				java.util.Optional.empty());
		Student student6 = new Student("James", 4, 3.9, "male", 22,
				Arrays.asList("swimming", "basketball", "baseball", "football"), java.util.Optional.empty());

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, null);
		return students;
	}
}
