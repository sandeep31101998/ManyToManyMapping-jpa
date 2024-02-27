package com.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
