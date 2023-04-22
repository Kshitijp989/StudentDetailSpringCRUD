package com.app.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.Entity.Student;

import com.app.Repository.StudentRepository;
@Service
public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	 

		public Student getStudentById(Long id) {
	        Student student = studentRepository.findById(id).get();
	        if (student == null) {
	            throw new EntityNotFoundException("Student not found with id " + id);
	        }
	        return student;
	    }

	    public Student createStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public Student updateStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }
}
