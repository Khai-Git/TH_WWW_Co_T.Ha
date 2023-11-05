package com.fit.ServletMVC;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Mary", "Public", "mary@code.com"));
		students.add(new Student("John", "Doe", "john@code.com"));
		students.add(new Student("Ajay", "Rao", "ajay@code.com"));
		return students;

	}
}
