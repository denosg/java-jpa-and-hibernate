package com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.jpa;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {
    // we use JPA to talk to the database here:
    @PersistenceContext // kinda same as @Autowired
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }
}
