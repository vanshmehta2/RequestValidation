package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	 List<Student> arraylist = new ArrayList<Student>();
	@Override
	public Student saveStudent(Student student1) {
		Student student = new Student();
		student.setId(student1.getId());
		student.setFirstName(student1.getFirstName());
		student.setLastName(student1.getLastName());
		student.setEmail(student1.getEmail());
		arraylist.add(student);
		return student;
	}
	@Override
	public ResponseEntity<List<Student>> getAllStudents() {
		return new ResponseEntity<>(arraylist,HttpStatus.OK);
	}
	
	@Override
	public Student getStudentById(long  id) {
		Student findedStudent = null;
		for (Student find :arraylist){
			if(find.getId() == id) {
				findedStudent = find;
				   break;
			}
		}
		return findedStudent;
		
	}
	@Override
	public Student updateStudent(Student student, long id) {
	 Student oldStudent = null;
	     for (Student find :arraylist){
			if(find.getId() == id) {
				oldStudent = find;
				   break;
			}
	     }
	     oldStudent.setFirstName(student.getFirstName());
	     oldStudent.setLastName(student.getLastName());
	     oldStudent.setEmail(student.getEmail());
		      return oldStudent;
	}
	@Override
	   public void deleteStudent(long id) {
//		arraylist.removeIf(x-> x.getId() == id);
		for (Student find :arraylist){
			if(find.getId() == id) {
              arraylist.remove(find);
				break;
			}
		}
	}


}
