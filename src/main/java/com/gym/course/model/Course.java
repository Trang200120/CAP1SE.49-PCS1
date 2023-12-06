package com.gym.course.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseId")
    private int courseId;

    @Column(name = "Description")
    private String description;

    @Column(name = "CourseName")
    private String name;

    @Column(name = "CreateDate")
    private Date createdDate;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;


}
