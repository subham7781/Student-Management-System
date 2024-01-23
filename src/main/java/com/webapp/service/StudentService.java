package com.webapp.service;

import java.util.List;

import com.webapp.entiry.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(long id);
	
	Student UpdateStudent(Student student);
	
	void deleteStudentById(long id);
	

}
