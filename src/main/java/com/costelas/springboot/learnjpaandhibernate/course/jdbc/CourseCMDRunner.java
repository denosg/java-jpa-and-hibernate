package com.costelas.springboot.learnjpaandhibernate.course.jdbc;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.jpa.CourseJpaRepository;
import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCMDRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // .insert() for the others
//        repository.insert(new Course(1, "Learn AWS Now", "costelas"));
//        repository.insert(new Course(2, "Azure", "costelas"));
//        repository.insert(new Course(3, "Firebase", "costelas"));
        repository.save(new Course(1, "Learn AWS Now", "costelas"));
        repository.save(new Course(2, "Azure", "costelas"));
        repository.save(new Course(3, "Firebase", "costelas"));
        // watch commits to see differences
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("costelas"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Firebase"));
        System.out.println(repository.findByName(""));
    }
}
