package com.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
