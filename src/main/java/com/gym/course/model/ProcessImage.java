package com.gym.course.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class ProcessImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column
    private String imageLink;

    @Column
    private int angle;

    @Column
    private String note;

    @Column
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;


}
