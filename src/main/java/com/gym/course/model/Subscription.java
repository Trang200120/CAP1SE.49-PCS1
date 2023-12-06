package com.gym.course.model;

import jakarta.persistence.*;

@Entity
@Table
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;
}
