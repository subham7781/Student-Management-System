package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entiry.Student;
import com.webapp.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService  studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(ModelMap map) {
		map.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	@GetMapping("/student/new")
    public String CreateStudentForm(ModelMap map) {
		Student student = new Student();
		map.addAttribute("student", student);
		return "create_student";
    }
	@PostMapping("/students")
    public String SaveStudent(@ModelAttribute("student") Student student,ModelMap map) {
		studentService.saveStudent(student);
		map.addAttribute("students", studentService.getAllStudent());
		return "students";
    }
	@GetMapping("/students/edit/{id}")
	public String EditStudentForm(@PathVariable long id,ModelMap map) {
		map.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String UpdateStudent(@PathVariable long id,
			@ModelAttribute("student")Student  student,
			ModelMap map	) {
		Student ExistingStudent =studentService.getStudentById(id);
		ExistingStudent.setId(id);
		ExistingStudent.setFirstName(student.getFirstName());
		ExistingStudent.setLastName(student.getLastName());
		ExistingStudent.setEmail(student.getEmail());
		
		studentService.UpdateStudent(ExistingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
