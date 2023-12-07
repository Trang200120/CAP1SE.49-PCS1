package com.gym.course.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column
    @Email
    private String email;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column
    private int state;

    @Column
    private int role;

    @Column
    private int sex;

    @Column
    private String linkInstagram;

    @Column
    private String linkFacebook;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Profile profile;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ProcessImage> processImages;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<WorkoutHistory> workoutHistories;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<WorkoutCalender> workoutCalenders;

    @OneToMany(mappedBy = "send", cascade = CascadeType.ALL)
    private List<Message> sendMessages;

    @OneToMany(mappedBy = "received", cascade = CascadeType.ALL)
    private List<Message> receivedMessages;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;
}


