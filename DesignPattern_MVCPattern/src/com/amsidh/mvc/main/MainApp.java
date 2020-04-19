package com.amsidh.mvc.main;

import com.amsidh.mvc.controller.StudentController;
import com.amsidh.mvc.model.Student;
import com.amsidh.mvc.view.StudentView;

public class MainApp {

	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.printStudentDetails();

		// update model data
		controller.setName("John");

		controller.printStudentDetails();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
