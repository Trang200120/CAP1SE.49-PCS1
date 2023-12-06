package com.gym.course.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VideoId")
    private int videoId;

    @Column(name = "VideoName")
    private String name;

    @Column(name = "VideoLink")
    private String link;

    @Column(name = "View")
    private int view;

    @Column(name = "Like")
    private int like;

    @Column(name = "CreateDate")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "CourseId")
    private Course course;
}
