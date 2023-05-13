package com.costelas.springboot.learnjpaandhibernate.course.jdbc;

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
                    values(1, 'Learn AWS', 'costelas')
                    """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
