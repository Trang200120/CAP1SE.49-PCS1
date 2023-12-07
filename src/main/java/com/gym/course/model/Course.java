package com.gym.course.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column
    private String description;

    @Column
    private String name;

    @Column
    private Date createdDate;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Video> videos;


}
