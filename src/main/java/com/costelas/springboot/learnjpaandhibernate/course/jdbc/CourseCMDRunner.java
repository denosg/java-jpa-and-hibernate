package com.costelas.springboot.learnjpaandhibernate.course.jdbc;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCMDRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now", "costelas"));
        repository.insert(new Course(2, "Azure", "costelas"));
        repository.insert(new Course(3, "Firebase", "costelas"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
