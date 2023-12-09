package com.gym.course.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
@Entity
@Table
public class WorkoutCalender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

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
	private int rating;

	@Column
	private String note;

	@ManyToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;

}
