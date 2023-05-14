package com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.springdatajpa;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// when we use Spring data JPA, we use interface
// <Course, Long> what we manage, primary key
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}
