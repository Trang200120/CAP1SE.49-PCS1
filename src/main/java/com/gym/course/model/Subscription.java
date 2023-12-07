package com.gym.course.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "CourseId")
    private Course course;

    @Column
    private Timestamp register;

    @Column
    private Timestamp expired;
}
