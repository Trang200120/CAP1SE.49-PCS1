package com.gym.course.model;

import jakarta.persistence.*;

@Entity
@Table
public class WorkoutHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;
}
