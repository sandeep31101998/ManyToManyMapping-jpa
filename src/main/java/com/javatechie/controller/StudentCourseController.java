package com.javatechie.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.entity.Student;
import com.javatechie.repository.CourseRepository;
import com.javatechie.repository.StudentRepository;

@RestController
public class StudentCourseController {

	private StudentRepository studentRepository;

	private CourseRepository courseRepository;

	public StudentCourseController(StudentRepository studentRepository, CourseRepository courseRepository) {
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}

	@PostMapping("/saveStudentWithCourse")
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}
