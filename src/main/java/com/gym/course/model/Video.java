package com.gym.course.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int videoId;

    @Column
    private String name;

    @Column
    private String link;

    @Column
    private int views;

    @Column
    private int likes;

    @Column
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "CourseId")
    private Course course;
}
