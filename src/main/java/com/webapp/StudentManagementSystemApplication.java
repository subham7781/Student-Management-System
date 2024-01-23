package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webapp.entiry.Student;
import com.webapp.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student Student1 = new Student("subham", "Sahu","Subham465@gmail.com");
//		studentRepository.save(Student1);
//		
//		Student Student2 = new Student("sanjaya", "kumar", "Sanjaya585@gmail.com");
//		studentRepository.save(Student2);
//		
//		Student Student3 = new Student("tapan", "Sahu", "tapan676@gmail.com");
//		studentRepository.save(Student3);
	}

}
