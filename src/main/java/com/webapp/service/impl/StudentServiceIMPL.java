package com.webapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.entiry.Student;
import com.webapp.repository.StudentRepository;
import com.webapp.service.StudentService;
@Service
public class StudentServiceIMPL implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceIMPL(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
		
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
		
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student UpdateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);		
	}
	
	
}
