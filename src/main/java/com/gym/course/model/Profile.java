package com.gym.course.model;

import jakarta.persistence.*;

@Entity
@Table
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profileId;

    @Column
    private int height;

    @Column
    private int weight;

    @Column
    private int waist;

    @Column
    private int chest;

    @Column
    private int hip;

    @Column
    private int arm;

    @Column
    private int videoId;

    @OneToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;
}
