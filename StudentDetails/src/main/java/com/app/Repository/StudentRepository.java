package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
