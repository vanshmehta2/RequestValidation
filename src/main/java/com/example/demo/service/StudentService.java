package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Student;

public interface StudentService {
	Student saveStudent(Student student);
	ResponseEntity<List<Student>> getAllStudents();
	Student getStudentById(long id);
	Student updateStudent(Student student, long id);
	void  deleteStudent(long id);
}
