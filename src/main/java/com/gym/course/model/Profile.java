package com.gym.course.model;

import jakarta.persistence.*;

@Entity
@Table
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profileId;

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

    @Column(name = "VideoId")
    private int videoId;

    @OneToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;
}
