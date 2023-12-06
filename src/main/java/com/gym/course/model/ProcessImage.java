package com.gym.course.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class ProcessImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "ImageLink")
    private String imageLink;

    @Column(name = "Angle")
    private int angle;

    @Column(name = "Note")
    private String note;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;


}
