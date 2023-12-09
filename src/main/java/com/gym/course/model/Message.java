package com.gym.course.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String text;

	@Column
	private Timestamp time;

	@ManyToOne
	@JoinColumn(name = "Send")
	private Customer send;

	@ManyToOne
	@JoinColumn(name = "Received")
	private Customer received;

}
