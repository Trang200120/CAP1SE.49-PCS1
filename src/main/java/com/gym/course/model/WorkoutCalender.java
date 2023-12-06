package com.gym.course.model;

import jakarta.persistence.*;

@Entity
@Table
public class WorkoutCalender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Height")
    private int height;

    @Column(name = "Weight")
    private int weight;

    @Column(name = "Waist")
    private int waist;

    @Column(name = "Chest")
    private int chest;

    @Column(name = "Hip")
    private int hip;

    @Column(name = "Arm")
    private int arm;

    @Column(name = "Rating")
    private int rating;

    @Column(name = "Note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;

}
