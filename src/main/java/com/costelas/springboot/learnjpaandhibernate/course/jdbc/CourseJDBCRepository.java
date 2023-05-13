package com.costelas.springboot.learnjpaandhibernate.course.jdbc;

import com.costelas.springboot.learnjpaandhibernate.course.jdbc.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // typical annotation for spring when class talks to db
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values(?, ?, ?);
                    """;
    private static String DELETE_QUERY =
            """
                    delete from course
                    where id = ?
                    """;
    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
