package com.costelas.springboot.learnjpaandhibernate.course.jdbc.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // creates a mapping between our java bean and the table, we will use that mapping to fetch and send values
public class Course {
    // here we are creating a mapping from this bean to the table
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    // constructor
    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //to string
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
