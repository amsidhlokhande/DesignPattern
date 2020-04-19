package com.amsidh.mvc.main;

import com.amsidh.mvc.dao.StudentDao;
import com.amsidh.mvc.dao.StudentDaoImpl;
import com.amsidh.mvc.dto.Student;

public class MainApp {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
