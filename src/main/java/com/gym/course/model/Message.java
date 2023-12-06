package com.gym.course.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Text")
    private String text;

    @Column(name = "Time")
    private Timestamp time;

    @ManyToOne
    @JoinColumn(name = "Send")
    private Customer send;

    @ManyToOne
    @JoinColumn(name = "Received")
    private Customer received;
}
