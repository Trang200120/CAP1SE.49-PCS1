package com.gym.course.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int videoId;

	@Column
	private String name;

	@Column
	private String link;

	@Column
	private int views;

	@Column
	private int likes;

	@Column
	private Date createdDate;

	@ManyToOne
	@JoinColumn(name = "CourseId")
	private Course course;

}
