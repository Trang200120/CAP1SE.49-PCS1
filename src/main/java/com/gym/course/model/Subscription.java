package com.gym.course.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
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
