package com.gym.course.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerId")
    private int customerId;

    @Column(name = "Email")
    @Email
    private String email;

    @Column(name = "NickName")
    private String nickName;

    @Column(name = "Password")
    private String password;

    @Column(name = "State")
    private int state;

    @Column(name = "Role")
    private int role;

    @Column(name = "Sex")
    private int sex;

    @Column(name = "LinkInstagram")
    private String linkInstagram;

    @Column(name = "LinkFacebook")
    private String linkFacebook;

    @OneToOne(mappedBy = "customer")
    private Profile profile;

    @OneToMany(mappedBy = "customer")
    private List<ProcessImage> processImages;

    @OneToMany(mappedBy = "customer")
    private List<WorkoutHistory> workoutHistories;

    @OneToMany(mappedBy = "customer")
    private List<WorkoutCalender> workoutCalenders;

    @OneToMany(mappedBy = "send")
    private List<Message> sendMessages;

    @OneToMany(mappedBy = "received")
    private List<Message> receivedMessages;

    @OneToMany(mappedBy = "customer")
    private List<Subscription> subscriptions;
}
