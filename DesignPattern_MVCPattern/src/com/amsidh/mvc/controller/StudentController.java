package com.amsidh.mvc.controller;

import com.amsidh.mvc.model.Student;
import com.amsidh.mvc.view.StudentView;

public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getName() {
		return model.getName();
	}

	public void setName(String name) {
		model.setName(name);
	}

	public void printStudentDetails() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
