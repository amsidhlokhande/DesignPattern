package com.amsidh.mvc.dao;

import java.util.List;

import com.amsidh.mvc.dto.Student;

public interface StudentDao {

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
