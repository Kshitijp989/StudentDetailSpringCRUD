package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Student;
import com.app.Service.StudentService;

@RestController
@RequestMapping("/api/students") // changed the base URL to "/api/students"
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("") // returns all students
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}") // returns a single student by ID
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("") // creates a new student
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}") // updates a student by ID
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id); // set the ID of the student to update
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}") // deletes a student by ID
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
