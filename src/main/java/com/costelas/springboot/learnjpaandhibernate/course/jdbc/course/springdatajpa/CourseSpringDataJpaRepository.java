package com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.springdatajpa;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// when we use Spring data JPA, we use interface
// <Course, Long> what we manage, primary key
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
